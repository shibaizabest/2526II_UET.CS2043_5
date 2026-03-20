

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setBirthday(new MyDate(17,12,2007));
        emp1.setName("Thinh");

        Employee emp2 = new Employee(emp1);
        System.out.println(emp2.getBirthday());
    }
}
