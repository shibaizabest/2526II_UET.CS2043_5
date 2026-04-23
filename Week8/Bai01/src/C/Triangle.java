package C;

public class Triangle extends Shape{
    private int a, b;

    @Override
    public double getArea() {
        return 0.5 * a * b;
    }
}
