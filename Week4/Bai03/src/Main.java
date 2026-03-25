import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Employee> e = new ArrayList<>();

        for (int i = 0; i < n; i ++){
            String typeOfEmployee = sc.next();
            String id = sc.next();
            String name = sc.next();
            double baseSalary = sc.nextDouble();

            if (typeOfEmployee.equals("T")){
                int overtimeHours = sc.nextInt();
                e.add(new Technician(name, id, baseSalary, overtimeHours));
            } else if (typeOfEmployee.equals("O")) {
                e.add(new OfficeWorker(name, id, baseSalary));
            }
        }

        double totalPay = 0;
        for (Employee x: e){
            double pay = x.calculatePay();
            System.out.println(x.getName() + " - Pay: " + Double.toString(pay));
            x.work();
            totalPay += pay;
        }
        System.out.print("Total Pay = ");
        System.out.printf("%.1f",totalPay);
    }
}

