public class Speaker extends ElectricDevice implements CanChangeVolume, CanConnectWifi{

    public Speaker(String id, String name){
        super(id, name);
    }

    @Override
    public void setHigherVolume(){
    }
    @Override
    public void setLowerVolume(){

    }

    @Override
    public void connectWifi(){
        System.out.println(getDeviceName() + " connected to Wifi");
    }
}
