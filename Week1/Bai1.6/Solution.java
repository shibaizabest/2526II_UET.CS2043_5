public class Solution {
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int num = 2 ; num*num <= n ; num++){
            if (n % num == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.isPrime(10));
        System.out.println(a.isPrime(-10));
        System.out.println(a.isPrime(11));
        System.out.println(a.isPrime(1977));
    }
}
