public class QuickSort {
    public static void main(String[] args) {
        int [] nums = {3,4,2,1,5,0};
        quickSort(nums, 0, nums.length -1);
        for(int element : nums){
            System.out.print(element + " ");
        }
    }
    public static void quickSort(int[] nums, int low, int high) {
        if(low >= high) return ;
        int partitionIndex = partition(nums,low,high);
        quickSort(nums,low,partitionIndex-1);
        quickSort(nums,partitionIndex +1, high);
    }
    public static int partition(int[] nums, int low , int high){
        int pivot = nums[low];
        int i = low, j = high;
        while(i < j ){
            while(i <= high && nums[i] <= pivot) i++;
            while(j>= low && nums[j] > pivot) j--;
            if(i < j) swap(nums, i, j);
        }
        swap(nums,low,j);
        return j ;
    }
    public static void swap(int [] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;
    }
}