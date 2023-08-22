public class LargestSumSubArray {
    public static void main(String[] args) {
//        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = new int[]{5,4,-1,7,8};
        int[] res = maxSubArray(nums);
        System.out.println("Result Array ");
        for (int i = res[0]; i <= res[1]; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int[] maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0 ;
        int n = nums.length;
        int resStart = -1, resEnd = -1, start =-1;
        for(int i=0 ; i<n ;i++){
            if(sum ==0) start = i ;
            sum += nums[i];
            if(sum > res){
                res = sum ;
                resStart = start;
                resEnd = i ;
            }
            if(sum < 0) sum = 0 ;
        }
        return new int[]{resStart, resEnd};
    }
}
