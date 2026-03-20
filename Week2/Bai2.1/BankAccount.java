public class BankAccount{
    private String accountNumber;
    private double balance;
    private String ownerName;

    //Constructor day du
    public BankAccount(String accountNumber, String ownerName, double balance){
        if (balance < 0){
            this.balance = 0;
            System.out.println("So du phai lon hon 0");
        }
        else{
            this.balance = balance;
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    //Constructor 1
    public BankAccount(String accountNumber, String ownerName){
        this(accountNumber, ownerName, 0.0);
    }

    //Nap tien
    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("So tien nap vao phai lon hon 0.");
            return;
        }
        this.balance += amount;
    }

    //Rut tien
    public boolean withdraw(double amount){
        if (amount <= 0){
            System.out.println("So tien rut phai lon hon 0" );
            return false;
        }
        if (amount > this.balance){
            System.out.println("So tien rut phai nho hon so du.");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public double getBalance(){
        return this.balance;
    }

}