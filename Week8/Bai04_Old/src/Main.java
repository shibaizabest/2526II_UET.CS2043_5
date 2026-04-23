public class Main {
    public static void main(String[] args) {
        ParkingCustomer customer = new ParkingCustomer("Lưu Quang Thịnh");

        customer.addTicket(new ParkingTicket(new Vehicle("29A-12345", Vehicle.BIKE), 2));
        customer.addTicket(new ParkingTicket(new Vehicle("29B-67890", Vehicle.BIKE), 5));

        customer.addTicket(new ParkingTicket(new Vehicle("30H-11111", Vehicle.CAR), 1));
        customer.addTicket(new ParkingTicket(new Vehicle("30K-22222", Vehicle.CAR), 4));

        customer.addTicket(new ParkingTicket(new Vehicle("29C-33333", Vehicle.TRUCK), 3));
        customer.addTicket(new ParkingTicket(new Vehicle("29C-44444", Vehicle.TRUCK), 6));

        System.out.println(customer.receipt());
    }
}
