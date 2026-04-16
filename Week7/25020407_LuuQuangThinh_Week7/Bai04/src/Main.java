public class Main {
    public static void main(String[] args) throws InterruptedException {
        BookStore myStore = new BookStore();

        myStore.addBook("Mein kaft", 2);
        myStore.addBook("Calculus 3", 1);
        myStore.addBook("Shibaizabest", 3);

        Thread t1 = new Thread(() ->{
            System.out.println("Thread " + Thread.currentThread().getName() + " - Mein kaft: " + myStore.getStock("Mein kaft"));
        });
        Thread t2 = new Thread(() ->{
            System.out.println("Thread " + Thread.currentThread().getName() + " - Shibaizabest: " + myStore.getStock("Shibaizabest"));
        });
        Thread t3 = new Thread(() ->{
            System.out.println("Thread " + Thread.currentThread().getName() + " - Calculus 2: " +myStore.getStock("Calculus 2"));
        });
        Thread t4 = new Thread(() ->{
            myStore.addBook("Calculus 2", 3);
            System.out.println("Added Calculus 2");
        });
        Thread t5 = new Thread(() ->{
            myStore.borrow("Calculus 2", 2);
            System.out.println("Borrowed Calculus 2");
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
    }
}
