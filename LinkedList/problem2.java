// Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
// Delete all nodes which have values greater than 25.

import java.util.*;
import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the number from 1 to 50");
        boolean bool = false;
        
        while (bool != true){
            list.add(sc.nextInt());

            System.out.println("to continue press 0 or enter 1 to end : ");
            int i = sc.nextInt();
            if (i==1){
                bool = true;
            }
        }
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            if (list.get(i) >25){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
    
}
