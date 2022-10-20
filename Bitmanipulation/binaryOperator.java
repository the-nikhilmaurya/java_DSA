public class binaryOperator {
    public static void binaryAND()
    {
        System.out.println(5&6);
        //101 & 110 = 100 i.e(4)
    }
    public static void binaryOR()
    {
        System.out.println(5|6);
        //101 | 110 = 111 i.e(7)
    }

    public static void binaryXOR()
    {
        System.out.println(5^6);
        //101 ^ 110 = 011 i.e(3)
    }
    public static void binaryOnesCompliment()
    {
        System.out.println(~5);
        // ~101 = 010  i.e2
    }
    public static void binaryLeftShift(){
        System.out.println(5<<2);
        
        // a<<b = a*(2^b)
    }
    public static void binaryRightShift(){
        System.out.println(6>>1);
    }
    public static void OddEven(int n){
        int bitmask = 1;
        if((n&bitmask)==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    public static void main(String[] args) {
        // binaryAND();
        // binaryOR();
        // binaryXOR();
        // binaryOnesCompliment();
        // binaryLeftShift();
        // binaryRightShift();
        OddEven(10);
    }
}
