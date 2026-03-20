public class Solution{
    public static long fibonacci(long n){
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
    if (n > 92) return Long.MAX_VALUE;

        long n1 = 1;
        long n2 = 1;
        for (int i = 3; i <= n; i++){
                long tmp = n1 + n2;
                n1 = n2;
                n2 = tmp;

        }
        return n2;
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.fibonacci(8));
        System.out.println(a.fibonacci(0));
        System.out.println(a.fibonacci(-4));
        System.out.println(a.fibonacci(95));
    }
}