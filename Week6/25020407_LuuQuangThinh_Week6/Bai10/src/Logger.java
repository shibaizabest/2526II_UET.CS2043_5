public class Logger {
    private static Logger instance;

    private Logger(){
        System.out.println("Logger instance created successfully.");
    }

    public static Logger getInstance() {
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void logInfo(String msg){
        System.out.println("[INFO] " + msg);
    }
    public void logError(String msg){
        System.err.println("[ERROR] "+ msg);
    }
}
