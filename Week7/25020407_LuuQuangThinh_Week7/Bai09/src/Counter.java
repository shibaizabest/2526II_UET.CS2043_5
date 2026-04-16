import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int value = 0;
    private final ReentrantLock reentrantLock = new ReentrantLock();

    public void increment(){
        if (reentrantLock.tryLock()){
            try{
                value++;
            }
            finally {
                reentrantLock.unlock();
            }
        }
        else{
            System.out.println(Thread.currentThread().getName() + " khong lay dc khoa");
        }
    }

    public int getValue() {
        return value;
    }
}
