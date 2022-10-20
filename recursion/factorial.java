import java.util.Scanner;

// using recursion to find factorial of a given number
public class factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(+n+"! is "+findfactorial(n));
        sc.close();
    }
    public static int findfactorial (int n)
    {
        if (n <= 1)
        return 1;

        return n*findfactorial(n-1);
    }
}