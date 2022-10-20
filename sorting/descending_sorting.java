import java.util.Arrays;
import java.util.Collections;

/* I will maintain the sorting algorithm in the descending pattern that is i 
 * will sort in descending manner
 */
public class descending_sorting {

    // buble sort
    /* in this i have to check whether the current position is greater than than the next one 
     * if so then i will swap
     */
    public  static void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // selection sort
    /* In this i will pick the smallest element from unsorted part 
     * and will place it to end
     */
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j])
                    minpos = j;
            }
            if(minpos != i){
                int temp = arr[minpos];
                arr[minpos] = arr[i];
                arr[i] = temp;
            }

        }
    }

    // inbuilt sort 
    /* In this i will use the java.util package and collection.reverse order */
    public static void inbuiltsort(Integer arr[]){
        // to apply collections i will have to declare arr as an object type
        Arrays.sort(arr,Collections.reverseOrder());
    }



    
    // counting sort
    /* In this i will find the max element in array then i will create 
    * count array if current position of  count array resides in the 
    * original array then i will update the count of that positon by one
    * then with help of this i will change the original array
    */
    public static void countingsort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Integer.max(arr[i], max);
        }
        // System.out.println(max);
        int count[] = new int [max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // printarray.print(count);
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j] =i;
                count[i]--;
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int arr[]= {9,6,8,4,5,4,6,8,2};
        // bubblesort(arr);
        // selectionsort(arr);
        // inbuiltsort(arr);
        countingsort(arr);
        printarray.print(arr);
    }
    
}
