import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    private ArrayList<Integer> arrayList;
    private int index;
    public Sum(int index, ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
        this.index = index;
    }

    @Override
    public Integer call() throws Exception {
        Integer sum = 0;
        if (arrayList.size() % 2 == 0) {
            for (Integer x : arrayList) {
                sum += x * x;
            }
            System.out.println("Stage 2 - Array " + index + ": sum of squares = " + sum);
        }
        else{
            for (Integer x : arrayList){
                sum += x*x*x;
            }
            System.out.println("Stage 2 - Array " + index + ": sum of cubes = " + sum);
        }
        Main.result.addAndGet(sum);
        return sum;
    }
}
