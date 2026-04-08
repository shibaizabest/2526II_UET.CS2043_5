import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String UIConfig = (new Scanner(System.in)).next();
        UIFactory factory = null;

        if (UIConfig.equals("win")){
            factory = new WindowsFactory();
        } else if (UIConfig.equals("mac")){
            factory = new MacFactory();
        }
        if (factory != null) {
            factory.createButton();
            factory.createCheckbox();
        }
    }
}
