import java.util.ArrayList;
import java.util.concurrent.Callable;

public class SumOfArray implements Callable<Integer> {
    private Integer biggest, secondBiggest;
    private String id;
    private ArrayList<Integer> array;

    public SumOfArray(String id, ArrayList<Integer> array){
        this.array = array;
        this.id = id;
        biggest = null;
        secondBiggest = null;
    }

    @Override
    public Integer call() throws Exception {
        for (Integer x : array){
            if (biggest == null || biggest < x){
                biggest = x;
            }
        }
        for (Integer x : array){
            if ((secondBiggest == null || secondBiggest < x) && x != biggest){
                secondBiggest = x;
            }
        }
        return secondBiggest;
    }
}
