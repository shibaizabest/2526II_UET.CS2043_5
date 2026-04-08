public class Main {
    public static void main(String[] args) {
        LegacySorter legacySorter = new LegacySorter();
        Sorter sorter = new SorterAdapter(legacySorter);

        int[] arr = {1, 3, 5, 2, 3, 10, 9};
        arr = sorter.sort(arr);

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
