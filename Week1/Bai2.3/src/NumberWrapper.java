

public class NumberWrapper {
    public int value;

    public NumberWrapper(int _value){
        value = _value;
    }

    public void swap(NumberWrapper a, NumberWrapper b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
