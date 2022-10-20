// given a string s= "aalladd" remove the duplicates and  print "ald"
/* In this we will use the a boolean map array which we will keep record 
 * wheter the currChar has is printed or not
 */
public class RemoveDuplicates {
    public static void removeDup(String s,int indx,boolean array[],StringBuilder sb){
        // StringBuilder sb = new StringBuilder();
        if(indx == s.length())
        {
            System.out.println(sb);
            return;
        }
        char currChar = s.charAt(indx);
        if(array[currChar-'a'])
        {
            removeDup(s, indx+1, array,sb);
        }
        else{
            
            array[currChar-'a'] = true;
            removeDup(s, indx+1, array,sb.append(currChar));
        }
          
    }

    public static void main(String[] args) {
        String s = "alasad";
        removeDup(s, 0, new boolean[26], new StringBuilder(""));
    }
}
