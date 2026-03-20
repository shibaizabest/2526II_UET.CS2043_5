public class Main{
    public static void main(String[] args) {
        NumberWrapper n1 = new NumberWrapper(5);
        NumberWrapper n2 = new NumberWrapper(10);

//        n1.setValue(5);
//        n2.setValue(10);

        NumberWrapper.swap(n1,n2);

        System.out.println(n1.getValue());
        System.out.println(n2.getValue());
    }
}