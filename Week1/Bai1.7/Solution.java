public class Solution {
    public static int reverse(int n){
        long res = 0;
        boolean isNegative = (n < 0);
        n = Math.abs(n);

        while (n > 0){
            res = res*10 + n%10;
            n/=10;
        }

        if (res > Integer.MAX_VALUE) return 0;
        if (isNegative) return (int) -res;
        return (int) res;
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.reverse(1001));
        System.out.println(a.reverse(-1021));
        System.out.println(a.reverse(100));
    }
}
