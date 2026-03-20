public class Solution {
    public static int sumOfDigits(int n){
        if (n < 0){
            n = -n;
        }
        int sum = 0;

        while (n > 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.sumOfDigits(101));
        System.out.println(a.sumOfDigits(-101));
        System.out.println(a.sumOfDigits(123));
    }
}
