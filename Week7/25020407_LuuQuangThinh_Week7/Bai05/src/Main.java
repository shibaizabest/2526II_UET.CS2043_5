import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try{
            Future<Boolean> future1 = executor.submit(new Order("01", 1200));
            Future<Boolean> future2 = executor.submit(new Order("02", 1501));
            System.out.println("Task 01: " + future1.get());
            System.out.println("Task 02: " + future2.get());

            System.out.println("Success = " + Order.getCount());
            Logger logger = Logger.getInstance();
            logger.getLogs();
        }catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executor.close();
        }
    }
}
