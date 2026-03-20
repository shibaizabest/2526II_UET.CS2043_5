public class NumberWrapper{
    private int value;

    public NumberWrapper(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public static void swap(NumberWrapper a, NumberWrapper b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}