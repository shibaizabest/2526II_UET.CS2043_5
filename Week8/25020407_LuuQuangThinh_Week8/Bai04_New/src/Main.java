public class Main {
    public static void main(String[] args) {
        ParkingCustomer customer = new ParkingCustomer("Lưu Quang Thịnh");

        customer.addTicket(new ParkingTicket(new Bike("29A-12345"), 2));
        customer.addTicket(new ParkingTicket(new Bike("29B-67890"), 5));

        customer.addTicket(new ParkingTicket(new Car("30H-11111"), 1));
        customer.addTicket(new ParkingTicket(new Car("30K-22222"), 4));

        customer.addTicket(new ParkingTicket(new Truck("29C-33333"), 3));
        customer.addTicket(new ParkingTicket(new Truck("29C-44444"), 6));

        System.out.println(customer.receipt());
    }
}
