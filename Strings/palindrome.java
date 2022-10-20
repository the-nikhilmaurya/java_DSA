// package Strings;

/* palindrome is a string which will read same as from start and end to
 * eg. madam :- whether you start from starting m or ending m it will read as madam only
 */

public class palindrome {
    public static boolean checkPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="masdam";
        System.out.println(checkPalindrome(s));
    }
    
}
