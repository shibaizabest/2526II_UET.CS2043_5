import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try{
            Scanner sc = new Scanner(System.in);

            int n;
            ArrayList<Integer> temp = new ArrayList<>();
            int m = sc.nextInt();
            ArrayList<Future<Integer>> futures = new ArrayList<>();

            for (int i = 1; i <= m; i++){
                n = sc.nextInt();
                temp.clear();
                while(n-- > 0){
                    temp.add(sc.nextInt());
                }
                futures.add(executor.submit(new Prime(new ArrayList<>(temp))));
            }

            int max = -1;
            for (int i = 0; i < futures.size(); i++){
                Integer result = futures.get(i).get();
                max = Integer.max(max, result);
                System.out.println("Array " + i + ": " + result);
            }
            for (int idx = 0; idx < futures.size(); idx++){
                if (futures.get(idx).get() == max){
                    System.out.println("Most primes: Array " + idx + " with " + max + " primes" );
                }
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executor.close();
        }
    }
}
