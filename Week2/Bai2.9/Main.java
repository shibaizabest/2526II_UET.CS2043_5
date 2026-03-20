import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sp1 = ");
        String name1 = sc.next();
        System.out.print("Nhap gia sp1 = ");
        double price1 = sc.nextDouble();
        System.out.print("Nhap so luong sp1 = ");
        int quantity1 = sc.nextInt();
        System.out.print("Nhap giam gia sp1 = ");
        double discount1 = sc.nextDouble();

        System.out.print("Nhap ten sp2 = ");
        String name2 = sc.next();
        System.out.print("Nhap gia sp2 = ");
        double price2 = sc.nextDouble();
        System.out.print("Nhap so luong sp2 = ");
        int quantity2 = sc.nextInt();
        System.out.print("Nhap giam gia sp2 = ");
        double discount2 = sc.nextDouble();

        Product p1 = new Product(name1, price1, quantity1, discount1);
        Product p2 = new Product(name2, price2, quantity2, discount2);

        System.out.print("Nhap so luong sp1 can mua = ");
        int sl1 = sc.nextInt();
        System.out.print("Nhap so luong sp2 can mua = ");
        int sl2 = sc.nextInt();

        p1.sell(sl1);
        p2.sell(sl2);

        //Static
        System.out.println("Gia cuoi cua p1 la " + Double.toString(p1.calculateFinalPrice()));
        System.out.println("Gia cuoi cua p2 la " + Double.toString(p2.calculateFinalPrice()));

        Product.updateTaxRate(0.08);
        System.out.println("Gia cuoi cua p1 la " + Double.toString(p1.calculateFinalPrice()));
        System.out.println("Gia cuoi cua p2 la " + Double.toString(p2.calculateFinalPrice()));

        p1.updateDiscount(10.0);
        System.out.println("Gia cuoi cua p1 la " + Double.toString(p1.calculateFinalPrice()));
        System.out.println("Gia cuoi cua p2 la " + Double.toString(p2.calculateFinalPrice()));

        System.out.println(Product.getTotalRevenue());
    }
}