public class Food extends Product{
    private String expiryDate;

    public Food(String id,String name, String expiryDate){
        super(id, name);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
    @Override
    public String toString(){
        return (getProductName() + " - " + expiryDate);
    }
}
