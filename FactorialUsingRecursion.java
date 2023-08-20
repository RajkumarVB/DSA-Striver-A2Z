public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
        System.out.println(factorialUsingParametrizedRecursion(1,5,1));
    }
    public static int calculateFactorial(int N){
        if(N ==1) return 1;
        return N * calculateFactorial(N-1);
    }
    public static int factorialUsingParametrizedRecursion(int start, int N,int result){
        if(start > N) return result;
        return factorialUsingParametrizedRecursion(start+1,N,result*start);
    }
}
