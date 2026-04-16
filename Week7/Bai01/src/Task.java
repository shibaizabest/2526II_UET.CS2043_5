public class Task implements Runnable{
    private String name;
    private int durationMs;

    public Task(String name, int durationMs){
        this.name = name;
        this.durationMs = durationMs;
    }

    @Override
    public void run(){
        System.out.println("Start" + this.name);
        try {
            Thread.sleep(durationMs);
        } catch (InterruptedException e) {
            System.out.println("Loi");
        }
        System.out.println("End" + this.name);
    }
}
