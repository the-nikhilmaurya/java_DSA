import javax.annotation.processing.SupportedOptions;

// count the number of vowels occured in string entered by user
public class que1 {
    public static int countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "apple";
        s.replace("p", "");
        System.out.println(s);
        String s1 = "apple";
        System.out.println(countVowels(s));
        System.out.println(s1.compareTo(s));
        String s2 = "ApnaCollege".replace("l", "");
        System.out.println(s2);
    }
}
