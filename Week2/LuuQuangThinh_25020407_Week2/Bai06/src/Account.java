public class Account{
    private String accountId;
    private double balance;
    private Transaction[] history;

    public Transaction[] getHistory(){
        Transaction[] history = new Transaction[this.history.length];
        for (int i = 0 ; i < this.history.length ; i++){
            history[i] = new Transaction(this.history[i]);
        }
        return history;
    }

    public Account(String accountId, double balance, Transaction[] history){
        this.accountId = accountId;
        this.balance = balance;

        this.history = new Transaction[history.length];
        for (int i = 0 ; i < history.length ; i++){
            this.history[i] = new Transaction(history[i]);
        }
    }

    @Override
    public String toString(){
        String to_return = this.accountId + ' ' + Double.toString(this.balance) + '\n';
        for (int i = 0; i < this.history.length ; i++  ){
            to_return += (this.history[i]) + "\n";
        }
        return to_return;
    }
}