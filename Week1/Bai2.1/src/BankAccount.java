
public class BankAccount {
    private String accountNumber;
    private double balance;
    String ownerName;



    public BankAccount(String accountNumber, String _ownerName, double balance){
        this.accountNumber = accountNumber;
        ownerName = _ownerName;
        if (balance < 0){
            System.out.println("Your balance must be greater or equal to 0.");
            this.balance = 0;
        }
        else{
            this.balance = balance;
        }
    }

    public BankAccount(String accountNumber, String _ownerName){
        this(accountNumber, _ownerName, 0.0);
    }

    public void deposit(double amount){
        if (amount <= 0 ){
            System.out.println("The amount of money must be greater than 0.");
        }
        else{
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount){
        if (amount <= 0 || amount > this.balance)
            return false;
        this.balance -= amount;
        return true;
    }

    public double getBalance(){
        return this.balance;
    }
    @Override
    public String toString() {
        return "--------------------------" + '\n' +"STK: " + this.accountNumber +'\n' + "Chu the: " + ownerName + '\n' + "So du:" + this.balance + '\n' + "--------------------------";
    }
}
