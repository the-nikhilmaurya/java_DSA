/* In this we will given a set of Strings from which i have to find which 
 * lexigrophically biggest String means i have to compare the string in their alphabetical 
 * order and thereby determine the biggest string 
 * the method is .compareTo()  : s1.compareTo(s2)
 * it gives the three value 1st==0 then both are same else if >0 then first will be greater i.e s1
 * else <0 then s1 will be greater( in this method 'A' and 'a' are different)
 * we have one more method that is compareToIgnoreCase for which 'a' and 'A' are same
 */
public class lexiographically_order {
    public static void biggestString(String s[]){
        String bs = s[0];
        for(int i=1;i<s.length;i++)
        {
            if(bs.compareTo(s[i])<0)
                bs = s[i];
        }
        System.out.println("biggest string : "+bs);

        for(int i=1;i<s.length;i++)
        {
            if(bs.compareToIgnoreCase(s[i])<0)
                bs = s[i];
        }
        System.out.println("biggest string : "+bs);
    }

    public static void main(String[] args) {
        String s[] = {"mango" , "apple", "banana","watermelon","zab","Zig"};
        biggestString(s);
    }
    
}
