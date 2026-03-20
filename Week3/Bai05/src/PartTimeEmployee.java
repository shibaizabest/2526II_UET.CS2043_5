public class PartTimeEmployee extends Employee{
    private double workingHours, hourlyRate;

    public PartTimeEmployee(String name, double workingHours, double hourlyRate){
        super(name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public double getSalary(){
        return workingHours*hourlyRate;
    }
}
