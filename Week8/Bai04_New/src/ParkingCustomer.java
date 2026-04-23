import java.util.ArrayList;
import java.util.List;

public class ParkingCustomer {
    private final String name;
    private final List<ParkingTicket> tickets = new ArrayList<>();

    public ParkingCustomer(String name) {
        this.name = name;
    }
    public void addTicket(ParkingTicket ticket) {
        tickets.add(ticket);
    }

    public String receipt(){
        double totalFee = 0;
        int bonusPoints = 0;
        String result = "Parking Receipt for " + name + "\n";

        for (ParkingTicket each : tickets){
            double thisFee = each.getFee();

            totalFee += thisFee;
            bonusPoints += each.getBonusPoint();

            result += "\t" + each.getVehicle().getPlate() + "\t" + thisFee + "\n";
        }
        result += "Total fee is " + totalFee + "\n";
        result += "You earned " + bonusPoints + " bonus points";
        return result;
    }
}
