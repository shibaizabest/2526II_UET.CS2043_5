public abstract class Employee implements IWorkable{
    private String id, name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculatePay();
    //Class Employee khong bat buoc phai implement ham work cua interface

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}
