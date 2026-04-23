public abstract class Order {
    private double weight;
    private double distance;

    public Order(double weight, double distance) {
        this.weight = weight; this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double getDeliveryFee();
    public abstract String getLabel();
}
