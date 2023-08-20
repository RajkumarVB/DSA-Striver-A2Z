public class SelectionSort {
    public static void main(String[] args) {
//        int[] nums = {5,1,3,8,22,4};
        int[] nums = {5,4,3,2,1};
        sort(nums);
        for(int element : nums){
            System.out.print(element + " ");
        }
    }
    public static void sort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n -1; i++) {
            int minIdx = i ;
            for(int j = i+1; j<n ; j++){
                if(nums[j] < nums[minIdx]) minIdx = j ;
            }
            swap(nums,i,minIdx);
        }
    }
    private static void swap(int[] nums, int i, int minIdx) {
        int temp ;
        temp = nums[i] ;
        nums[i] = nums[minIdx] ;
        nums[minIdx] = temp;
    }
}
