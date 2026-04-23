public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount myAccount = new BankAccount();

        Thread t1 = new Thread(() -> {
            int times = 1000;
            while(times-- > 0){
                myAccount.deposit(100);
            }
        }) ;

        Thread t2 = new Thread(() -> {
            int times = 1000;
            while(times-- > 0){
                myAccount.withdraw(100);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(myAccount.getBalance());
    }
}
