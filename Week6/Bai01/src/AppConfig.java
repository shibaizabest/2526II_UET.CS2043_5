public class AppConfig implements Runnable{
    private static volatile AppConfig instance;
    private String appName, version;
    private int logLevel;

    private AppConfig(){
        this.appName = "Auction-system";
        this.version = "1.0.0";
        this.logLevel = 1;
    }

    public static AppConfig getInstance(){
        if (instance == null){
            synchronized (AppConfig.class) {
                if (instance == null){
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    @Override
    public void run() {
        System.out.println(this.hashCode() + " - Thread name: " + Thread.currentThread().getName());
    }
}
