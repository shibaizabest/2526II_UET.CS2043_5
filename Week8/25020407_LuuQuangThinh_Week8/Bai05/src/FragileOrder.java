public class FragileOrder extends Order{

    public FragileOrder(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double getDeliveryFee() {
        return (getWeight() * 5000 + getDistance() * 700 + 20000);
    }

    @Override
    public String getLabel() {
        return "[HÀNG DỄ VỠ]";
    }
}
