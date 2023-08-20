import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
//        Test Code to check merge function
//        int[] nums = {10,11,20,22,2,3,8};
//        int mid = (nums.length)/2;
//        merge(nums,0,mid,nums.length-1);
//        for(int element : nums){
//            System.out.print(element + " ");
//        }
//        int[] nums = {20,10,22,11,3,8,2};
        int[] nums = {5,4,3,2,1,0};
        mergeSort(nums,0,nums.length-1);
        for(int element : nums){
            System.out.print(element + " ");
        }
    }
    public static void mergeSort(int[] nums, int low, int high){
        if(low >= high) return;
        int mid = (low + high)/2 ;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public static void merge(int[] nums, int low, int mid, int high){
        // [low, mid] is sorted
        // [mid+1, high] is sorted
        ArrayList<Integer> resultList = new ArrayList<>();
        int ptr1=low , ptr2 = mid+1;
        while (ptr1 <= mid && ptr2 <= high){
            if(nums[ptr1] < nums[ptr2]) {
                resultList.add(nums[ptr1]);
                ptr1++;
            }else {
                resultList.add(nums[ptr2]);
                ptr2++;
            }
        }
        while (ptr1 <= mid){
            resultList.add(nums[ptr1]);
            ptr1++;
        }
        while (ptr2 <= high){
            resultList.add(nums[ptr2]);
            ptr2++;
        }
        for(int i = low; i <= high; i++){
            nums[i] = resultList.get(i-low);
        }
    }
}