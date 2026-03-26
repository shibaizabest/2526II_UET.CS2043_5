import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ElectricDevice> e = new ArrayList<>();

        while(n-- > 0){
            String type = sc.next();
            String id = sc.next();
            String deviceName = sc.next();
            if (type.equals("L")){
                e.add(new Light(id, deviceName));
            }
            if (type.equals("AC")){
                e.add(new AirConditioner(id, deviceName));
            }
            if (type.equals("S")){
                e.add(new Speaker(id, deviceName));
            }
            if (type.equals("C")){
                e.add(new WindowCurtain(id, deviceName));
            }
        }

        Hub.turnOffAll(e);
        Hub.setupWifi(e);
    }
}
