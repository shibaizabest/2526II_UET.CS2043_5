class MotorBike extends Vehicle implements Refuelable{
    private double fuelLevel;

    @Override
    public String getInfo() {
        return info("Xe may");
    }

    @Override
    public void refuel(double liters) { fuelLevel += liters; }
}