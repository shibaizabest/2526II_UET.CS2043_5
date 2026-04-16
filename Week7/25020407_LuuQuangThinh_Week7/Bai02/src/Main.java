import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("k = ");
        int k = sc.nextInt();

        if (k > n){
            throw new AintNoWayyyyy("Lmfao");
        }

        while(n-- > 0){
            System.out.print("Number = ");
            arrayList.add(sc.nextInt());
        }

        ExecutorService executor = Executors.newFixedThreadPool(k);

        int avg = arrayList.size() / k;
        int i = 0;
        int sub = 0;

        ArrayList<Future<Integer>> results = new ArrayList<>();
        while (i < arrayList.size()){
            if (sub == k - 1){
                results.add(executor.submit(new Sum(new ArrayList<>(arrayList.subList(i, arrayList.size())))));
                break;
            }
            else{
                results.add(executor.submit(new Sum(new ArrayList<>(arrayList.subList(i, i + avg)))));
                i = i + avg;
                sub++;
            }
        }

        executor.shutdown();
        int sumOfArray = 0;
        for (Future<Integer> x : results){
//            System.out.println(x.get());
            sumOfArray += x.get();
        }
        System.out.println(sumOfArray);
    }
}
