public class CheckPalindrome {
    public static boolean IsPalindrome(int n)
    {
        int num = n;
        int m = 0;
        while(num>0)
        {
            int rem = num %10;
            m = m*10+rem;
            num /= 10;
        }
        // System.out.println(m);
        if(m == n)
        return true;

        return false;
    }
    public static void main(String[] args) {
        
        System.out.println(IsPalindrome(121));
    }
    
}
