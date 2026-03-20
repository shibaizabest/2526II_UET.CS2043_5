public class Main{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123xxx","Thinh",-10);
        BankAccount myAccount2 = new BankAccount("123xx", "Thinh", 100);
        myAccount2.withdraw(200);
        myAccount2.withdraw(90);
        System.out.println(myAccount2.getBalance());
    }
}