import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static AtomicInteger result = new AtomicInteger(0);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Future<ArrayList<Integer>>> threadPool1 = new ArrayList<>();
        ArrayList<Future<Integer>> threadPool2 = new ArrayList<>();

        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        try{
            for (int i = 0; i < n ; i++) {
                int m = sc.nextInt();
                ArrayList<Integer> temp = new ArrayList<>();

                while (m-- > 0) {
                    temp.add(sc.nextInt());
                }
                threadPool1.add(executor1.submit(new Prime(i, new ArrayList<>(temp), executor2)));
            }
        } finally {
            try{
                executor1.shutdown(); // Dung nhan them task
                if (executor1.awaitTermination(10, TimeUnit.SECONDS)) {
                    executor2.shutdown();
                    if (executor2.awaitTermination(10, TimeUnit.SECONDS)) {
                        System.out.println("Total = " + result.get());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
