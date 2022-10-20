import java.util.Arrays;
import java.util.Collections;

/* Here we will use the inbuoilt features of java to sort our array
 * for this we have to import java.util.*; package 
 */
public class inbuilt_sort{
     public static void main(String[] args) {
        // int array [] = { 8,9,2,5,3,1};
        // Arrays.sort(array);
        // System.out.println("Ascending order");
        // printarray.print(array);


        // System.out.println(" for  particular range");
        // Arrays.sort(array,0,4);
        // printarray.print(array);

        
        System.out.println("Descending order");
        // for this we have to use collections to use this we have to declare 
        // int as Integer that is  in object type rather than primitive type
        Integer arr[] = {8,9,2,5,3,1};
        Arrays.sort(arr,Collections.reverseOrder());
        printarray.print(arr);
    }
}