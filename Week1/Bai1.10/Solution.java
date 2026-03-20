public class Solution{
    public static int secondLargest(int[] a){
        int fi = Integer.MIN_VALUE;
        int se = Integer.MIN_VALUE;

        for (int i = 0; i < a.length ; i++){
            if (a[i] > fi){
                se = fi;
                fi = a[i];
            }
            else if (a[i] > se && a[i] < fi){
                se = a[i];
            }
        }

        if (se == Integer.MIN_VALUE){
            return -1;
        }

        return se;
    }
    public static void main(String[] args) {
       Solution a = new Solution();
       System.out.println(a.secondLargest(new int[]{1,2,3,4,5}));
        System.out.println(Solution.secondLargest(new int[]{1}));  
        System.out.println(a.secondLargest(new int[]{1,1,1,1}));
    }
}