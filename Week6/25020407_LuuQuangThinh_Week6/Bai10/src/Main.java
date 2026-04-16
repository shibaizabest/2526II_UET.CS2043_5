public class Main {
    public static void main(String[] args) {
        Logger i1 = Logger.getInstance();
        Logger i2 = Logger.getInstance();

        System.out.println(i1);
        System.out.println(i2);

        i1.logInfo("Application started");
        i1.logInfo("Processing data....");

        i2.logError("Something went wrong");
    }
}
