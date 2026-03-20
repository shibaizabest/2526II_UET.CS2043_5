public class SmartLight {
    private String id;
    private String name;
    private int brightness;

    public SmartLight(String id, String name, int brightness){
        this.id = id;
        this.name = name;
        this.brightness = brightness;
    }

    public SmartLight(String id, String name){
        this(id, name, 50);
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    public void setBrightness(String preset){
        switch (preset.toUpperCase()){
            case "MAX":
                this.setBrightness(100);
                break;
            case "MIN":
                this.setBrightness(10);
                break;
            case "ECO":
                this.setBrightness(30);
                break;
            default:
                System.out.println("Preset khong co trong day");
        }
    }
    public void connectToHub(CentralHub hub){
        hub.registerDevice(this);
    }
    public String getName(){
        return this.name;
    }
    public int getBrightness(){
        return this.brightness;
    }
}