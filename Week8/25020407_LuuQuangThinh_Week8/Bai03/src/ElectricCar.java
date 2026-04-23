public class ElectricCar extends Vehicle implements Chargeable{
    private int batteryPercent;

    @Override
    public String getInfo() {
        return info("Xe dien");
    }

    @Override
    public void charge(int percent) { batteryPercent += percent; }
}
