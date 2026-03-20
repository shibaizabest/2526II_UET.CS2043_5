public class Main{
    public static void main(String[] args){
    Employee emp1 = new Employee("Nam", new MyDate(1,1,2000));
    Employee emp2 = new Employee(emp1);
    emp1.setBirthday(new MyDate(2,2,2000));
    System.out.println(emp2.getBirthday());
    }
}