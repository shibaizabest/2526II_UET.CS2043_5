public class ArrayUtils<T> {
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static <T extends Comparable<T>> void sort (T[] array){
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (array[i].compareTo(array[j]) < 0){
                    swap(array, i, j);
                }
            }
        }
    }
}
