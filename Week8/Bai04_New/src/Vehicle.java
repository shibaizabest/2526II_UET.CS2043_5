public abstract class Vehicle {
    private final String plate;

    public Vehicle(String plate) {
        this.plate = plate;
    }

    public String getPlate() { return plate; }

    abstract public double getFee(int hours);

    public int getBonus(int hours){
        return 1;
    }
}
