import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

// given a string with character repeating itself i have to count the repetaion
// if it is greater than one then i have print character along with repeatation count
// eg. aaaabbbc= a4b3c
public class stringCompressor {

    // using string class
    public static String compressor (String s){
        String ns = ""; // this is the new string
        for (int i=0;i<s.length();i++)
        {
            int count =1;
            // Integer count =1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1) )
            {
                count++;
                i++;
            }
            ns = ns +s.charAt(i);
            if(count>1)
            ns += count;
        }
        return ns;
    }
    
    // using StringBuilder
    public static String compressor1(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int count =1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count>1)
                sb.append(count);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aavvaabsdd";
        System.out.println(compressor1(s));
    }
}
