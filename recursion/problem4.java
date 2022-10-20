// find the sum of n natural number
public class problem4 {
    
    public static int sumOfN(int n){
        if(n==1)
            return n;
        return n+sumOfN(n-1);

    }
    public static void main(String[] args) {
        System.out.println(sumOfN(10));
    }
}
