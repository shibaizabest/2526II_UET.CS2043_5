import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private static List<String> logs;

    private Logger(){
        logs = new ArrayList<>();
    }

    public synchronized void writeLog(String id, Boolean status){
        if (status){
            logs.add("DONE "+ id);
        }
        else{
            logs.add("FAIL " + id);
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void getLogs(){
        for (String x : logs){
            System.out.println(x);
        }
    }
}
