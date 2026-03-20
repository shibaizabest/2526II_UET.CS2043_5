import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0){
            String typeOfEmployee = sc.next();
            String name = sc.findInLine("\"([^\"]*)\"").replace("\"",""); // "\ = dau ngoac kep , () la phan can lay , [] la mot bo khi tu, ^\" la khac dau ngoac, * la tat ca
            // Co nghia la lay tat ca ki tu tu dau ngoac thu nhat den dau ngoac thu 2 ma khong phai dau ngoac
            if (typeOfEmployee.equals("F")){
                double baseSalary = sc.nextDouble();
                double bonus = sc.nextDouble();
                double penalty = sc.nextDouble();
                FullTimeEmployee fte = new FullTimeEmployee(name, baseSalary, bonus, penalty);
                System.out.println(name + " - " + "Full-time" + " - " + fte.getSalary());
            }
            else{
                double workingHours = sc.nextDouble();
                double hourlyRate = sc.nextDouble();
                PartTimeEmployee pte = new PartTimeEmployee(name, workingHours, hourlyRate);
                System.out.println(name + " - " + "Part-time" + " - " + pte.getSalary());
            }
        }
    }
}
