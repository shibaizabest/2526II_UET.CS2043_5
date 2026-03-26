public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Tuoi", 20);
        Pair<String, String> p2 = new Pair<>("Ma SV", "SV001");
        Pair<Integer, Double> p3 = new Pair<>(105, 21.5);
    /*
    Khi co tinh go loi, se in ra:
    java: incompatible types: cannot infer type arguments for Pair<>
    reason: inference variable K has incompatible bounds
      equality constraints: java.lang.Integer
      lower bounds: java.lang.String
     */
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
