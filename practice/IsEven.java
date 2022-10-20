public class IsEven {
    public static boolean CheckEven(int n)
    {
        if(n%2 == 0)
        return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(CheckEven(9));
    }
}
