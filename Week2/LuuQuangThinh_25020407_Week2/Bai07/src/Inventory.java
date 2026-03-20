public class Inventory{
    private Product[] items;

    public Inventory(Product[] initialItems){

        this.items = new Product[initialItems.length];
        for (int i = 0; i < initialItems.length ; i++ ){
            this.items[i] = (new Product(initialItems[i]));
        }
    }

    public Product[] getItems(){
        Product[] gItems = new Product[items.length];
        for (int i = 0 ; i < items.length ; i++){
            gItems[i] = new Product(items[i]);
        }
        return gItems;
    }
}