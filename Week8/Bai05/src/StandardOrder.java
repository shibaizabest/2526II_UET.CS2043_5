public class StandardOrder extends Order{

    public StandardOrder(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double getDeliveryFee() {
        return (getWeight() * 3000 + getDistance() * 500);
    }

    @Override
    public String getLabel() {
        return "[THƯỜNG]";
    }
}
