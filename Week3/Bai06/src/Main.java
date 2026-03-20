import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalPrice = 0;
        while(n-- > 0){
            String productType = sc.next();
            String name = sc.findInLine("\"([^\"]*)\"").replace("\"","");
            if (productType.equals("E")){
                double price = sc.nextDouble();
                double warrantyPrice = sc.nextDouble();
                Electronics e = new Electronics(name, price, warrantyPrice);
                double finalPrice = e.getFinalPrice();
                totalPrice += finalPrice;
                System.out.println(e.getName() + " - " + "Electronics" + " - " + finalPrice);
            }
            else{
                double price = sc.nextDouble();
                String dateString = sc.next();
                Food f = new Food(name, price, dateString);
                double finalPrice = f.getFinalPrice();
                totalPrice += finalPrice;
                System.out.println(f.getName() + " - " + "Food" + " - " + finalPrice);
            }
        }
        System.out.println("Total = " + totalPrice);
    }
}
/*
3
E "Laptop" 1000 50
F "Milk" 30 2026-03-30
F "Bread" 20 2026-03-05
 */