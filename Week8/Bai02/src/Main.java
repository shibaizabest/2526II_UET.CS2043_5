public class Main {
    public static void main(String[] args) {
        PayRoll system = new PayRoll();
        OldPayRoll oldSystem = new OldPayRoll();

        String name = "Nguyen Van A";
        double baseSalary = 30000000;
        int workDays = 20;
        int totalDays = 22;
        double taxRate = 0.15;
        double bonus = 2000000;

        system.printPayroll(name, baseSalary, workDays, totalDays, taxRate, bonus);
        oldSystem.printPayroll(name, baseSalary, workDays, totalDays, taxRate, bonus);
    }
}
