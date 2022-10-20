/* Large elements comes to end of array 
 * by swapping with adjacent element.
 * 
 * In this we will take two loops int first will start from zero to array.length-1
 * and the second will start from zero to array.length-1-n, we have taken here -n 
 * because in the previous turn the last element will be sorted i.e the maximum we 
 * sorted to right 
 */
// package sorting;
public class Bubblesort_algo {
    
    public static void main(String[] args) {
        int array[] = {4,5,6,2,9};
        bubblesort(array);
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    public static void bubblesort(int array[]){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1-i;j++){
                // here we will check whether if elememt of current position 
                // is greater than the current position +1 if yes then we will swap
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
