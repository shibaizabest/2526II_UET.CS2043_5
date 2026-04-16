import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BookStore {
    private Map<String, Integer> stock;

    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public BookStore(){
        stock = new HashMap<>();
    }

    public int getStock(String title){
        readWriteLock.readLock().lock();

        try{
            return stock.getOrDefault(title, 0);
        }
        finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void addBook(String title, int qty){
        readWriteLock.writeLock().lock();
        try{
            stock.put(title, stock.getOrDefault(title, 0) + qty);
        }
        finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public boolean borrow(String title, int qty){
        readWriteLock.writeLock().lock();
        try{
            int stockQuantity = stock.getOrDefault(title, 0);
            if (stockQuantity < qty){
                System.out.println("Khong hop le | Khong du stock");
                return false;
            }
            else{
                stock.put(title, stockQuantity - qty);
                return true;
            }
        }
        finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
