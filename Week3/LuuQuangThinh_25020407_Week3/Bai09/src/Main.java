import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<IPayable> payableList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            String payType = sc.next();
            if (payType.equals("S")){
                String id = sc.next();
                String name = sc.next();
                int workingHour = sc.nextInt();
                double hourlyRate = sc.nextDouble();
                payableList.add(new PartTimeStaff(id, name, workingHour, hourlyRate));
            }
            else if (payType.equals("I")){
                String itemName = sc.next();
                int quantity = sc.nextInt();
                double pricePerItem = sc.nextDouble();
                payableList.add(new Invoice(itemName, quantity, pricePerItem));
            }
        }
        double total = 0;
        for (IPayable x : payableList){
            if (x instanceof PartTimeStaff p){
                System.out.println("PartTimeStaff " + p.getName() + " - Payment: " + p.getPaymentAmount());
                total += p.getPaymentAmount();
            }
            else if (x instanceof  Invoice i){
                System.out.println("Invoice " + i.getItemName() + " - Payment: " + i.getPaymentAmount());
                total += i.getPaymentAmount();
            }
        }
        System.out.print("Total Payment = " + total);
    }
}
