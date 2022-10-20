public class UppercaseTolowercase {
    // uppercase to lowercase
    public static char Tolowercase(char a) {
        int b = (int) a | 32;
        // System.out.println(b);
        return (char)b;
    }

    // lowercaser to uppercase and vice vers
    public static char Touppercase(char a) {
        int b = (int) a ^ 32;
        // System.out.println(b);
        return (char)b;
    }

    public static void main(String[] args) {
        char a = 'Q';
        System.out.println(Tolowercase(a));
        System.out.println(Touppercase(a));
    }

}
