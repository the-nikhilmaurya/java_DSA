// find nth fibonacci series
public class Fibonacci_series {
    public static int findFibonacci(int n) {
        if(n<=1)
            return n;
        return findFibonacci(n-1)+findFibonacci(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println(findFibonacci(5));
    }
    
}
