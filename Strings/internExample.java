// https://www.javatpoint.com/java-string-intern
public class internExample {
    public static void main(String[] args) {
   
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();// returns string from pool, now it will be same as s2
        // with the help of SCP (string constant pool)
        System.out.println(s1 == s2);// false because reference is different
        System.out.println(s2 == s3);// true because reference is same
        System.out.println(5&6);
    }

}
