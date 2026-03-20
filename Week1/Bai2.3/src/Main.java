

public class Main {
    public static void main(String[] args) {
        NumberWrapper a = new NumberWrapper(10);
        NumberWrapper b = new NumberWrapper(20);
        a.swap(a,b);
        System.out.println(a.value);
        System.out.println(b.value);
    }
}
