public class Main{
    public static void main(String[] args) {
        Product[] arr = {new Product("1","Skibidi",1), new Product("2", "toilet", 2)};
        Inventory kho = new Inventory(arr);
        arr[0].setPrice(5000);
        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        Product[] arr2 = kho.getItems();
        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr2[i]);
        }
    }
}