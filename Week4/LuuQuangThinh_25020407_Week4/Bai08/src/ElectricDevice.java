abstract public class ElectricDevice {
    private String deviceName, id;
    private boolean status;


    public ElectricDevice(String id, String deviceName){
        this.deviceName = deviceName;
        this.id = id;
        status = false;
    }
    public void turnOn(){
        System.out.println(deviceName + " turned on");
    }
    public void turnOff(){
        System.out.println(deviceName + " turned off");
    }

    public String getDeviceName() {
        return deviceName;
    }
}
