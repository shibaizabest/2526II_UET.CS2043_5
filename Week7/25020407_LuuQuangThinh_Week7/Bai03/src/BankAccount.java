public class BankAccount{
    private int balance;

    public BankAccount(){
        balance = 0;
    }
    public BankAccount(int balance){
        this.balance = balance;
    }
    public synchronized void deposit(int amount) {
        this.balance += amount;
        notifyAll();
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
        while (amount > balance){
            wait();
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
