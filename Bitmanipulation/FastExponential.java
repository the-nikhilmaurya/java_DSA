import java.rmi.StubNotFoundException;

import javax.sound.sampled.SourceDataLine;

public class FastExponential {
    public static int NPowerOfA(int a,int n){
        int ans = 1;
        while (n>0){
            if((n&1)!=0)
                ans = ans*a;
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    // a^n % p = modularExponentional
    // https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/
    public static int ModularExponential(int a,int n,int p)
    {
        int ans =1;
        while(n>0){
            if((n&1)!=0)
                ans = ans *a;
            a *=a;
            n=n>>1;
        }
        return (ans%p);
    }
    public static void main(String[] args) {
        // System.out.println(NPowerOfA(2, 1));
        System.out.println(ModularExponential(2, 5, 13));
    }
    
}
