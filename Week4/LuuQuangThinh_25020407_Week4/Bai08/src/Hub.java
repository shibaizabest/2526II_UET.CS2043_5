import java.util.ArrayList;

public class Hub <T>{
    public static <T> void turnOffAll(ArrayList<T> array){
        System.out.println("Turn Off All Devices:");

        for (T x: array){
            if (x instanceof ElectricDevice y){
                y.turnOff();;
            }
        }
        System.out.println();
    }

    public static <T> void setupWifi(ArrayList<T> array){
        System.out.println("Setup wifi:");
        for (T x: array){
            if (x instanceof CanConnectWifi y){
                y.connectWifi();
            }
        }
    }

}
