public class OfficeWorker extends Employee{

    public OfficeWorker(String id, String name, double baseSalary){
        super(id, name, baseSalary);
    }
    @Override
    public double calculatePay(){
        return getBaseSalary();
    }
    @Override
    public void work(){
        System.out.println("Soan thao van ban");
    }
}
