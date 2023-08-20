import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
//        print1toN(1,userInput);
        printNto1(1,userInput);
    }
    public static void print1toN(int start, int input){
        if(start > input) return;
        System.out.println(start);
        print1toN(start+1, input);
    }

    public static void printNto1(int start, int input){
        if(start > input) return;
        printNto1(start+1,input);
        System.out.println(start);
    }
    public static int[] printNos(int x) {
        int[] result = new int[x];
        solve(result,0,x);
        return result;
    }
    public static void solve(int[] resultArray, int start, int x){
        if(start ==x) return; 
        resultArray[start] = start+1; 
        solve(resultArray, start+1, x);
    }
}