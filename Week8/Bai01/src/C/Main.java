package C;

public class Main {
    public double getArea(String shapeType, double a, double b) {
        if (shapeType.equals("rectangle")) return a * b;
        if (shapeType.equals("triangle"))  return 0.5 * a * b;
        if (shapeType.equals("circle"))    return 3.14159 * a * a;
        return -1;
    }
    //Switch Statements (hoặc lạm dụng if-else)
    //Solution: Replace Conditional with Polymorphism
    public static void main(String[] args) {

    }
}
