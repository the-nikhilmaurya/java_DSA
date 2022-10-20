

/* pattern advanced making a diamond */
public class diamond_pattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int m=1;m<=i-1;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=n-i;k++)
            {
                System.out.print("*");
            }
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
