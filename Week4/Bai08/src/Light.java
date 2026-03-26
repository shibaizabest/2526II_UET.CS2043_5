public class Light extends ElectricDevice implements CanChangeBrightness{

    public Light(String id, String deviceName){
        super(id, deviceName);
    }

    @Override
    public void setBrighter(){
        System.out.println("Tang do sang cua den");
    }
    @Override
    public void setDarker(){
        System.out.println("Giam do sang cua den");
    }


}
