public class Electronics extends Product{
    private static double taxRate = 0.1;
    private double warrantyPrice;

    public Electronics(String name, double price, double warrantyPrice){
        super(name, price);
        this.warrantyPrice = warrantyPrice;
    }

    public double getFinalPrice(){
        return (getPrice()*(1+taxRate)+warrantyPrice);
    }

}
