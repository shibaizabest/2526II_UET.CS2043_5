import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount{
    private AtomicInteger balance = new AtomicInteger(0);

    public BankAccount(){
    }
    public BankAccount(int balance){
        this.balance = new AtomicInteger(balance);
    }
    public void deposit(int amount) {
        this.balance.addAndGet(amount);
//        notifyAll();
    }

    public void withdraw(int amount) {
        while (true) {
            int current = balance.get();
            if (amount > current) {
                // Có thể thêm Thread.onSpinWait() hoặc sleep ngắn để giảm tải CPU
                continue;
            }
            // Thao tác nguyên tử: "Nếu giá trị vẫn là current thì mới set thành current - amount"
            if (balance.compareAndSet(current, current - amount)) {
                return; // Thành công
            }
            // Nếu compareAndSet trả về false, nghĩa là có thread khác đã chen vào sửa balance
            // Vòng lặp sẽ tự động chạy lại để lấy giá trị mới.
        }
    }

    public int getBalance() {
        return balance.get();
    }
}
