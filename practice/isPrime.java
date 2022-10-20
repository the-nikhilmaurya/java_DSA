public class isPrime {
    // public static boolean checkPrime(int n )
    // {
    //    if (n == 2)
    //    return true;
    //     for (int i=2;i<n;i++)
    //     {
    //         if(n%i == 0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean checkPrime(int n )
    {
       if (n == 2)
       return true;
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    //prime in range
    public static void PrimeinRange(int n,int m)
    {
        for(int i=n;i<=m;i++)
        {
            if(checkPrime(i))
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println(checkPrime(9));
        PrimeinRange(3, 20);
    }
}
