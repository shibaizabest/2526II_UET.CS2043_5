import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finalResult = 0;

        int n = sc.nextInt();

        ExecutorService executor1 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ExecutorService executor2 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        ExecutorCompletionService<ResultWrapper> service1 = new ExecutorCompletionService<>(executor1);

        try{
            for (int i = 0; i < n; i++){
                int m = sc.nextInt();
                ArrayList<Integer> temp = new ArrayList<>();

                while (m-- > 0){
                    temp.add(sc.nextInt());
                }

                service1.submit(new Prime(i, temp));
            }
            ArrayList<Future<Integer>> future2 = new ArrayList<>();
            for (int i = 0; i < n; i ++){
                Future<ResultWrapper> future = service1.take();
                ResultWrapper result1 = future.get();

                future2.add(executor2.submit(new Sum(result1.index, new ArrayList<>(result1.data))));
            }
            for (Future<Integer> f : future2){
                finalResult += f.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            executor1.close();
            executor2.close();
            System.out.println("Total = " + finalResult);
        }
    }
}
/*
4
5  2 3 4 5 6
4  7 8 9 10
3  11 12 13
4  2 4 6 8

 */
