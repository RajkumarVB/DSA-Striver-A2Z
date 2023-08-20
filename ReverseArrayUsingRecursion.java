public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        reverseArray(0,arr.length -1, arr);
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    public static void swap(int left, int right, int[] arr){
        int temp ;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    private static void reverseArray(int left, int right, int[] arr) {
        if(left < right){
            swap(left,right,arr);
            reverseArray(left+1, right-1,arr);
        }
    }
}