import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length;
        int left = 0, right = 0 ;
        int res = -1;
        long sum = 0;
        while(right < n){
            sum += a[right];
            while(left <= right && sum > k){
                sum -= a[left];
                left ++;
            }
            if(sum ==k) res = Math.max(res,right - left +1);
            right++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0};
        // Expected answer is 21
        System.out.println(longestSubarrayWithSumK(a,52));
    }
}
