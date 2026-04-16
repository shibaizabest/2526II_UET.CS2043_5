public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task("Task 1", 1000);
        Thread thread1 = new Thread(task1, "Task 1");

        Task task2 = new Task("Task 2", 500);
        Thread thread2 = new Thread(task2, "Task 2");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("All tasks done");
    }
}
