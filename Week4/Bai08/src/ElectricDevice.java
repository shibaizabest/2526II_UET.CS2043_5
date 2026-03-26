abstract public class ElectricDevice {
    private String deviceStatus;

    public ElectricDevice(){
        deviceStatus = "OFF";
    }
    public void turnOn(){
        deviceStatus = "ON";
    }
    public void turnOff(){
        deviceStatus = "OFF";
    }

    public String getDeviceStatus(){
        return deviceStatus;
    }
}
