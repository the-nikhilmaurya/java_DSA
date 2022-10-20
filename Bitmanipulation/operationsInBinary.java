public class operationsInBinary {
    // get ith bit
    public static int GetIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0)
            return 0;
        else
            return 1;
    }

    // set ith bit  = set particular bit as 1
    public static int SetithBit(int n,int i){
        int bitmask =1<<i;
        return n|bitmask;
    }
    
    // clear ith bit = set particular bit as 0
    public static int ClearithBit(int n ,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    // updateith bit = set the bit as given means if 1 then set the as 1 and if 0 then 
    // clear ith bit as zero
    public static int UpdateIthBit(int n,int i,int newBit){
        if (newBit ==0)
            return ClearithBit(n, i);
        else if(newBit == 1)
            return SetithBit(n, i);
        else 
            return -1;
    }

    // clear last i bits = setting all the i times bit as zero
    public static int ClearIBits(int n,int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }

    // clear range of bits = setting the bit of ranges as zero
    public static int ClearRangeBits(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    } 
    public static void main(String[] args) {
        // System.out.println(GetIthBit(10, 3));
        System.out.println(SetithBit(0, 2));
        // System.out.println(ClearithBit(10, 1));
        // System.out.println(UpdateIthBit(3, 1, 0));
        // System.out.println(ClearIBits(15, 2));
        // System.out.println(ClearRangeBits(10, 2, 4));
    }
    
}
