public class Solution {
    public static int gcd (int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0) return b;
        if (b == 0) return a;

        if (b % a == 0){
            return a;
        }
        return gcd(b % a, a);
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.gcd(6,5));
        System.out.println(a.gcd(-6,5));
        System.out.println(a.gcd(6,9));
        System.out.println(a.gcd(-10,5));
    }
}
