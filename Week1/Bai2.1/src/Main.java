public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("xxxzzz222", "LUU QUANG THINH", -100);
        myAccount.deposit(1000);
        myAccount.deposit(-100.8);
        System.out.println(myAccount.withdraw(2000));
        System.out.println(myAccount.withdraw(100));
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount);
    }
}
