public class Square extends Shape{

    public Square(int x, int y){
        super(x, y);
    }

    @Override
    public void draw(){
        System.out.println("Ve hinh vuong tai (" + Integer.toString(x) + ", " + Integer.toString(y) + ")" );
    }
    @Override
    public void erase(){
        System.out.println("Xoa hinh vuong tai (" + Integer.toString(x) + ", " + Integer.toString(y) + ")" );
    }
}
