// find the factorial of a number
public class problem3 {
    public static int factorial(int n){
        // if(n==0)
        //     return 1;
        if(n<=1)
            return n;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
