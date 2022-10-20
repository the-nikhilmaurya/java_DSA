/* question 4: For a given string convert each the first letter of
 * each word to uppercase
 */
public class convertToUppercase {
    public static  void convert(String s){
        StringBuilder sb = new StringBuilder("");
        // char a = Character.toUpperCase(s.charAt(0));
        // sb.append(a);
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '&& i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else
                sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s = "hi, i am Nikhil maurya ";
        convert(s);
    }
}
