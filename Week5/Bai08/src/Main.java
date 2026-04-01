import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputFile = sc.nextLine();
        try{

            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(inputFile))){
                System.out.print("n = ");
                int n = sc.nextInt();

                while( n-- > 0){
                    dos.writeInt(sc.nextInt());
                }
            }

            try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))) {
                while (true) {
                    System.out.println(dis.readInt());
                }
            } catch (EOFException e) {
                System.out.println("Da doc het file.");
            }
        }catch (IOException e) {
            System.err.println("Loi I/O: " + e.getMessage());
        }
    }
}