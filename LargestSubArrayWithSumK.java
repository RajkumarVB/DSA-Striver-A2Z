import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
        int res = -1 ;
        HashMap<Long,Integer> prevSum = new HashMap<>();
        long sum = 0 ;
        for(int i =0; i<n; i++){
            sum += a[i];
            if(sum ==k){
                res = Math.max(res,i+1);
            }
            long rem = sum -k;
            if(prevSum.containsKey(rem)){
                int len = i - prevSum.get(rem);
                res = Math.max(res,len);
            }
            if(a[i] != 0) prevSum.put(sum,i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0};
        // Expected answer is 21
        System.out.println(longestSubarrayWithSumK(a,52));
    }
}
