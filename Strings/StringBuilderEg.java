/* StringBuilder is the modification of string class in which unlike the string 
 * modification can be done and hence it become mutuable
 */
public class StringBuilderEg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }
    /* This take time complexitiy of O(n [i.e26])
     * where as in string this would take O(26*n*n)
     */
    
}
