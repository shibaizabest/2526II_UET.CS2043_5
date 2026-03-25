
public class Main {
    public static void main(String[] args) {
        Integer[] i = {5, 1, 3, 2};
        String[] s = {"Java", "C++", "Python"};
        Student[] st = {new Student("Nam"), new Student("Phong"), new Student("Ha")};

        ArrayUtils.sort(i);
        ArrayUtils.sort(s);
        ArrayUtils.sort(st);

        printArray(i);
        printArray(s);
        printArray(st);
    }

    public static <T> void printArray(T[] array){
        for (T item: array){
            System.out.print(item+ " ");
        }
        System.out.println();
    }
}
