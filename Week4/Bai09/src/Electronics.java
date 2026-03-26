public class Electronics extends Product{
    private String warrantyMonths;

    public Electronics(String id,String name, String warrantyMonths){
        super(id, name);
        this.warrantyMonths = warrantyMonths;
    }

    public String getWarrantyMonths() {
        return warrantyMonths;
    }
    @Override
    public String toString(){
        return (getProductName() + " - " + warrantyMonths + " thang bao hanh");
    }
}
