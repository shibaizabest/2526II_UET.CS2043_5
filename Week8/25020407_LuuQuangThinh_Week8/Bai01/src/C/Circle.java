package C;

public class Circle extends Shape{
    private int r;
    @Override
    public double getArea() {
        return 3.14159 * r * r;
    }
}
