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
        System.out.println("After removing GPA < 5.0: ");
        printArr(students);

        System.out.println();

        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("After sorting by name: ");
        printArr(students);

        Operation<Double> add = (a, b) -> a + b;
        Operation<Double> subtract = (a, b) -> a - b;
        Operation<Double> multiply = (a, b) -> a * b;
        Operation<Double> divide = (a, b) -> (b != 0 ? a / b : 0.0);
        System.out.println("Cộng: " + add.execute(10.5, 5.5));
        System.out.println("Trừ: " + subtract.execute(10.5, 5.5));
        System.out.println("Nhân: " + multiply.execute(10.5, 5.5));
        System.out.println("Chia: " + divide.execute(10.5, 5.5));
    }
    public static <T> void printArr(ArrayList<T> arr){
        for (T x : arr){
            System.out.print(x);
        }

    }
}
/*
4
S01 NguyenVanA 7.5
S02 TranThiB 4.5
S03 LeVanC 8.0
S04 PhamVanD 5.0
 */