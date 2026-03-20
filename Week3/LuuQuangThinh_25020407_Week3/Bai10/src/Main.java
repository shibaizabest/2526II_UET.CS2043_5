import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Employee> ee = new ArrayList<>();
        while(n-- > 0){
            String employeeType = sc.next();
            String name = sc.next();
            double baseSalary = sc.nextDouble();
            switch (employeeType){
                case "D":
                    int overtimeHours = sc.nextInt();
                    ee.add(new Developer(name, baseSalary, overtimeHours));
                    break;
                case "T":
                    int bugsFound = sc.nextInt();
                    ee.add(new Tester(name, baseSalary, bugsFound));
                    break;
                default:
                    ee.add(new Employee(name, baseSalary));
            }
        }
        for (Employee e : ee){
            if (e instanceof Developer dev){
                System.out.println(dev.getName() + " - Bonus: " + dev.calculateBonus());
                System.out.println("Tang khoa hoc AWS \n");
            }
            else if (e instanceof Tester tes){
                System.out.println(tes.getName() + " - Bonus: " + tes.calculateBonus());
                System.out.println("Tang tool Test \n");
            }
            else{
                System.out.println(e.getName() + " - Bonus: " + e.calculateBonus() + '\n');
            }
        }
    }
}
