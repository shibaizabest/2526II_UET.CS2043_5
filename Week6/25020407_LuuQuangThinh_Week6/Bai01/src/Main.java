public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(AppConfig.getInstance(), "Thread 1");
        Thread t2 = new Thread(AppConfig.getInstance(), "Thread 2");

        t1.start();
        t2.start();
    }
}
