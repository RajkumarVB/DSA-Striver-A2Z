import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] inp = {2,0,0,3};
        int k = 3;
        System.out.println(solve(inp, k));
    }
    private static int solve(int[] inp, int k ) {
        int n = inp.length;
        int res = -1 ;
        HashMap<Long,Integer> prefixSum = new HashMap<>();
        long sum  =0 ;
        for(int i =0; i<n ; i++){
            sum+= inp[i];
            if (sum ==k){
                res = Math.max(res,i+1);
            } else {
                if(prefixSum.containsKey(sum-k)){
                    int len = i-prefixSum.get(sum-k);
                    res= Math.max(res,len);
                }
            }
            if(!prefixSum.containsKey(sum)) prefixSum.put(sum,i);
        }
        return res;
    }

    private static void printHashMapContents(HashMap<Long, Integer> hashMap){
        for(var obj : hashMap.entrySet()){
            System.out.print(obj.getKey() + "->" + obj.getValue() + " ");
        }
        System.out.println();
    }

    private static void printAllSubArrays(int[] inp) {
        int n = inp.length;
        for (int i = 0; i <n; i++) {
            for (int j = i; j < n; j++) {
                printArray(inp,i,j);
            }
        }
    }

    private static void printArray(int[] inp, int i, int j) {
        for(int x =i ; x<=j ; x++){
            System.out.print(inp[x] + " ");
        }
        System.out.println();
    }
    private static int calculateSum(int[] inp, int i, int j) {
        int sum = 0 ;
        for(int x = i ; x<=j; x++){
            sum += inp[x];
        }
        return sum;
    }
}
