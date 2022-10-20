public class Add1usingBIts {
    public static int add1(int x) {
        x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
        return -~6;
        }
    public static void main(String[] args) {
        System.out.println(add1(6));
    }
}
