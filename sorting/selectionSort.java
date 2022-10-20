
/* In this we have to use two loops the first will go from 0 to array.length -2
 * and second will go from i+1 to array.length-1 . with this we will find the 
 * minimum element's index and after completing j's loop we will swap the minimum element 
 * to i th position
 */
public class selectionSort {
    public static void Selectionsort(int array[]){
        for (int i=0;i<array.length-1;i++){           // since we will not check for the last element
            int minpos = i;                             // will keep index of minimum element
            for (int j=i+1;j<array.length;j++){
                if(array[minpos]>array[j])
                    minpos = j;
            }
            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        int array [] = {6,7,3,2,4};
        Selectionsort(array);
        printarray.print(array);


    }
    
}
