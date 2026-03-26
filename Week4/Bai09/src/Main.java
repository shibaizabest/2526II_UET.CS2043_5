import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Warehouse<Electronics> e = new Warehouse<>();
        Warehouse<Food> f = new Warehouse<>();

        while (n-- > 0){
            String productType = sc.next();
            String productId = sc.next();
            String productName = sc.next();
            String extraInformation = sc.next();

            if (productType.equals("E")){
                e.nhapKho(new Electronics(productId, productName, extraInformation));
            } else if (productType.equals("F")) {
                f.nhapKho(new Food(productId, productName, extraInformation));
            }
        }
        System.out.println("Kho thuc pham: ");
        f.kiemKe();
        System.out.println("Kho dien tu: ");
        e.kiemKe();
    }
}
