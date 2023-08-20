import java.util.*;
import java.lang.*;
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(12));
    }
    public static long reverseBits(long n) {
        String binary = Long.toBinaryString(n);
        System.out.println(binary);
//        int len = binary.length(), power = 30;
//        long num=0;
//        if (binary.charAt(len-1) == '1') num+=Math.pow(2, 31);
//        for(int i=len-2; i>-1; i--){
//            if (binary.charAt(i) == '1')
//                num += 1<<power;
//            power--;
//        }
        return -1;
    }
}
