public class Worker implements Runnable{
    private volatile boolean running = true; // Phai co volatile de moi lan cap nhat running, luong chua bien nay duoc thong bao (trong run se thay doi gia tri)

    public void stop(){
        running = false;
    }

    @Override
    public void run() {
        while(running){
            System.out.println("Working on " + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
