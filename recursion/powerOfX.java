// calculating power of x raised to n using reursion
public class powerOfx {
    public static int calcPow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*calcPow(x, n-1);
    }


    // using optimized power of x raised to n
    public static int optimizedPow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPow = optimizedPow(x, n/2);
        if(n%2==0)
            return halfPow*halfPow;
        else
            return x*halfPow*halfPow;
    }


    public static void main(String[] args) {
        // System.out.println(calcPow(2, 5));
        System.out.println(optimizedPow(2, 5));
    }
}
