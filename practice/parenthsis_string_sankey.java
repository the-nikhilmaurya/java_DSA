import java.sql.SQLPermission;

/* You are developing a plugin for vs code,write a program to validate the parenthesis,square
 * bracket and curly braces for a block of code.Consider a string with the mentioned characters as an
 * input
 * string is valid if 
 * ->open bracket must be closed by the same type of brackets
 * ->open bracket must be closed in the correct order.
 */
public class parenthsis_string_sankey {
    public static void Check_validString(String s){
        // s = {{}}()[()]
        int array [] = new int [s.length()];    // this will store the ascii value of given string character
        for(int i=0;i<array.length;i++)
        {
            array[i] = (int)s.charAt(i);
        }
        // printarray.print(array);
        int curly = 0;          //123-125   {}
        int square = 0;         //40-41     []
        int parenthesis = 0;    //91-93     ()
        for(int i=0;i<array.length;i++)
        {
            if(array[i] == 123 || array[i]== 125)
                curly++;
            if(array[i] == 40 || array[i] == 41)
                parenthesis++;
            if(array[i] == 91 || array[i] == 93)
                square++;
        }
        // System.out.println(curly+" "+parenthesis+" "+square);
        if(curly%2 == 0 && parenthesis%2==0 && square%2 == 0)
        {
            System.out.println("valid string");
        }
        else
        {
            System.out.println("not a valid string");
        }

    }

    public static void checkString(String s){
        int curly = 0;          //123-125   {}
        int square = 0;         //40-41     []
        int parenthesis = 0;    //91-93     ()

        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)==123 || (int)s.charAt(i)==125)
                curly++;
            if((int)s.charAt(i)==40 || (int)s.charAt(i)==41)
                square++;
            if((int)s.charAt(i)==91 || (int)s.charAt(i)==93)
                parenthesis++;
        }
        if(curly%2 == 0 && parenthesis%2==0 && square%2 == 0)
        {
            System.out.println("valid string");
        }
        else
        {
            System.out.println("not a valid string");
        }
    }
    public static void main(String[] args) {
        String s ="{{}})(([)]";
        // Check_validString(s);
        checkString(s);
    }
}
