import java.time.LocalDate;

public class Food extends Product{
    LocalDate currentDate = LocalDate.now();
    LocalDate expireDate;

    public Food(String name, double price, String expireDateString){
        super(name, price);
        expireDate = LocalDate.parse(expireDateString);
    }

    public double getFinalPrice(){
        if (currentDate.plusDays(7).isAfter(expireDate)){
//            System.out.println(expireDate.toString());
//            System.out.println(currentDate.toString());
            return getPrice()*0.8;
        }
        else{
            return getPrice();
        }
    }
}
