import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Prime implements Callable<ArrayList<Integer>> {

    private ArrayList<Integer> arrayList;
    private int index;
    private ExecutorService executor2;

    public boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public Prime(int index, ArrayList<Integer> arrayList, ExecutorService executor2){
        this.index = index;
        this.arrayList = arrayList;
        this.executor2 = executor2;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> newArr = new ArrayList<>();
        int count = 0;
        for (Integer x : arrayList){
            if (isPrime(x)){
                newArr.add(x);
            }
        }
        System.out.println("Stage 1 - Array " + index + ": " + newArr);
        executor2.submit(new Sum(index, newArr));
        return new ArrayList<>(newArr);
    }
}
