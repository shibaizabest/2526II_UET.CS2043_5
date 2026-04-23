import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        orderList.add(new StandardOrder(10, 20));
        orderList.add(new StandardOrder(20, 10));
        orderList.add(new ExpressOrder(10, 20));
        orderList.add(new FragileOrder(10, 20));
        orderList.add(new BulkyOrder(100, 20));

        for (Order o : orderList){
            System.out.println("Phi giao hang = " + o.getDeliveryFee() + " && Nhan = " + o.getLabel());
        }

    }
}
