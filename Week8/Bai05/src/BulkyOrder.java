public class BulkyOrder extends Order{

    public BulkyOrder(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double getDeliveryFee() {
        return (getWeight() * 4000 + getDistance() * 600) + 50000;
    }

    @Override
    public String getLabel() {
        return "[HÀNG CỒNG KỀNH]";
    }
}
