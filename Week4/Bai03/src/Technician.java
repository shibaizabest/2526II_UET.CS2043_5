public class Technician extends Employee{
    private int overtimeHours;

    public Technician(String id, String name, double baseSalary, int overtimeHours){
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculatePay(){
        return getBaseSalary() + overtimeHours * 20000;
    }

    @Override
    public void work(){
        System.out.println("Lap dat thiet bi");
    }

}
