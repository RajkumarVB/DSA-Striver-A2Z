public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] inp = {2,3,5,1,9};
        int k = 10;
//        int[] inp = {2,3,5};
//        int k = 1;
        System.out.println(solve(inp, k));
    }
    private static int solve(int[] inp, int k ) {
        int n = inp.length;
        int res = -1 ;
        for (int i = 0; i <n; i++) {
            int sum  =0 ;
            for (int j = i; j < n; j++) {
                sum += inp[j];
                if (sum == k){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
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
