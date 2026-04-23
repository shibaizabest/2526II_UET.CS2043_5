class Car extends Vehicle {
    private int fuelLevel;

    public String getInfo() {
        return info("O to");
    }

    public void refuel(double liters) { fuelLevel += liters; }
}