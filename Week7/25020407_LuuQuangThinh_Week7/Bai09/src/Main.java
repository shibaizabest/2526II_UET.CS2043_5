public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000 ; i++){
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000 ; i++){
                counter.increment();
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10000 ; i++){
                counter.increment();
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10000 ; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(counter.getValue());
    }
}
