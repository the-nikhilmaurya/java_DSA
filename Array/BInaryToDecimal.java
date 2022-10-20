// converting binary to decimal 
public class BInaryToDecimal {
    public static void ToDecimal(int binary)
    {
        int num = binary;
        int pow = 0;
        int decimal = 0;
        while (num>0)
        {
            int lastdigit = num%10;
            decimal = decimal + (lastdigit*(int)Math.pow(2, pow));
            pow++;
            num = num/10;
        } 
        System.out.println("Binary to decimal of "+binary+" is "+decimal);
    }

    // Converting to Binary
    public static void ToBinary(int decimal)
    {
        int num = decimal;
        int pow = 0;
        int binary =  0;
        while (decimal>0)
        {
            int rem =  decimal%2;
            binary = binary + (rem*(int)Math.pow(10, pow));
            pow++;
            decimal = decimal/2;
        }
        System.out.println(("Binary of "+num+" is "+binary));
    }
    public static void main(String[] args) {
        // ToDecimal();
        ToBinary(19);
    }
}
