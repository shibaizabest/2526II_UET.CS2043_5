import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Prime implements Callable<Integer> {

    private ArrayList<Integer> arrayList;

    public boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public Prime(ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public Integer call() throws Exception {
        int count = 0;
        for (Integer x : arrayList){
            if (isPrime(x)) count++;
        }
        return count;
    }
}
