import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Prime implements Callable<ResultWrapper> {

    private ArrayList<Integer> arrayList;
    private int index;

    public boolean isPrime(int n) throws InterruptedException {
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0) return false;
        }
        Thread.sleep(40);
        return true;
    }

    public Prime(int index, ArrayList<Integer> arrayList){
        this.index = index;
        this.arrayList = arrayList;
    }

    @Override
    public ResultWrapper call() throws Exception {
        ArrayList<Integer> newArr = new ArrayList<>();
        int count = 0;
        for (Integer x : arrayList){
            if (isPrime(x)){
                newArr.add(x);
            }
        }
        System.out.println("Stage 1 - Array "+index+":"+arrayList);
        return new ResultWrapper(index, newArr);
    }
}
