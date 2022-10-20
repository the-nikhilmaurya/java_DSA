import java.util.Arrays;

/*If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not. */
public class anagrams {
    
    public static boolean Checkanagrams(String s1,String s2){
        if(s1.length()==s2.length()){
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char str1[]  = s1.toCharArray();
            char str2[] = s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean result = Arrays.equals(str1, str2);
            if(result)
                return true;
            else
            return false;

        }
        else 
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Checkanagrams("racee", "ecare"));
    }
}
