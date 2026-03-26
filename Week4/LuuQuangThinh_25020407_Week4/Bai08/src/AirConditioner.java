public class AirConditioner extends ElectricDevice implements CanConnectWifi{

    public AirConditioner(String id, String deviceName){
        super(id, deviceName);
    }

    @Override
    public void connectWifi(){
        System.out.println(getDeviceName() + " connected to Wifi");
    }

}
