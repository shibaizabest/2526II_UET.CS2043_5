public class Circle extends Shape{

    public Circle(int x, int y){
        super(x, y);
    }

    @Override
    public void draw(){
        System.out.println("Ve hinh tron tai (" + Integer.toString(x) + ", " + Integer.toString(y) + ")" );
    }
    @Override
    public void erase(){
        System.out.println("Xoa hinh tron tai (" + Integer.toString(x) + ", " + Integer.toString(y) + ")" );
    }
}
