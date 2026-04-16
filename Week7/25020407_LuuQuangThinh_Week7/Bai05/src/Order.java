import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Order implements Callable<Boolean> {
    private String id;
    private long processMs;
    private static AtomicInteger count = new AtomicInteger(0);

    public Order(String id, long processMs){
        this.id = id;
        this.processMs = processMs;
    }

    public static int getCount(){
        return count.intValue();
    }

    @Override
    public Boolean call() throws Exception {
        System.out.println("Start " + id);
        Thread.sleep(processMs);
        Logger logger = Logger.getInstance();
        if (processMs > 1500){
            logger.writeLog(id, false);
            return false;
        }
        else{
            count.incrementAndGet();
            logger.writeLog(id, true);
            return true;
        }
    }
}
