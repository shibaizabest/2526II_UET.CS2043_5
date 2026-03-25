import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomType = sc.next();
        int night = sc.nextInt();

        if (roomType.equals("S")){
            StandardRoom stdRoom = new StandardRoom(night);
            System.out.println(stdRoom.getFinalPrice());
        }
        else if(roomType.equals("V")){
            VipRoom vRoom = new VipRoom(night);
            System.out.println(vRoom.getFinalPrice());
        }

    }
}
