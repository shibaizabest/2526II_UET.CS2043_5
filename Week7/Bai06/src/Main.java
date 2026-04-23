import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
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
                futures.add(executor.submit(new SumOfArray(Integer.toString(i), new ArrayList<>(temp))));
            }

            int sum = 0;
            for (int i = 0; i < futures.size(); i++){
                Integer result = futures.get(i).get();

                if (result == null){
                    System.out.println("Array "+ i + ": Not found");
                }
                else{
                    System.out.println("Array "+ i + ": second largest = " + result);
                    sum += result;
                }
            }
            System.out.println("Sum = " + sum);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executor.close();
        }
    }
}
