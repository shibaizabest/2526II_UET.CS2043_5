public class Product {
    private String id, name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        id = "";
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
