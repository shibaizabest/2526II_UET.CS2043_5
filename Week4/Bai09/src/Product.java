abstract public class Product {
    private String productName, id;

    public Product(String id,String productName){
        this.productName = productName;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public String getId() {
        return id;
    }
}
