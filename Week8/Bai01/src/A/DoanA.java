package A;

public class DoanA {
    public double calculateFee(String t, int h, double r, boolean m) {
        double f = h * r;
        if (m) f = f * 0.9;
        return f;
    }
    // Doan code dinh Mysterious Name (ten cac bien kho hieu), can Rename Variable/Parameter
    public double newCalculateFee(String type, int hours, double rate, boolean isMember){
        double totalFee = hours * rate;
        if (isMember) totalFee = totalFee * 0.9;
        return totalFee;
    }
}
