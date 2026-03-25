import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            String id = sc.next();
            String name = sc.next();
            double gpa = sc.nextDouble();
            students.add(new Student(id, name, "N/A", gpa));
        }

        students.removeIf(student -> student.getGpa() < 5.0);
        students.forEach(System.out::println);
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

    }
}
