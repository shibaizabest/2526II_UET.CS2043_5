public class Solution {
    public static boolean isPalindrome(int n){
        if (n < 0) return false;
        long reversedNumber = 0;
        int tempOfN = n;
        while (tempOfN > 0){
            reversedNumber = reversedNumber*10 + tempOfN%10;
            tempOfN/=10;
        } 
        if (reversedNumber > Integer.MAX_VALUE) return false;
        return (n == reversedNumber);
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.isPalindrome(1001));
        System.out.println(a.isPalindrome(1201));
        System.out.println(a.isPalindrome(-1001));
        System.out.println(a.isPalindrome(100));
    }
}
