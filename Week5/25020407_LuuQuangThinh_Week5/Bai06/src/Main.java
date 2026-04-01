import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        try{
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a / b);
        }
        catch (InputMismatchException e){
            System.out.println("Dau vao khong hop le");
        } catch (ArithmeticException e) {
            System.out.println("Phep tinh khong hop le / Khong the chia cho 0");
        }
        finally {
            System.out.println("Program finished.");
        }
    }
}
