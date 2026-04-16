import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    private Integer sum = 0;
    private ArrayList<Integer> list;

    public Sum(ArrayList<Integer> list){
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        if (list.isEmpty()) return 0;

        for (Integer x : list){
            sum += x;
        }
        return sum;
    }
}
