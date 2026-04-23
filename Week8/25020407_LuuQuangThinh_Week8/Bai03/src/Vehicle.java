abstract class Vehicle {
    private String plate;
    private String brand;

    public String info(String vehicleType){
        return vehicleType + " [" + plate + "] - " + brand;
    }

    public abstract String getInfo();
}