/*In this we use an loop i from zero to array.length in the i th position the value we store in curr 
 * then using while loops if the previous one is greater than the curr element then 
 * we will change the value of and will continue till previous value is greater than the current one
  */

  // idea : pick an element from the unsorted part and plave in the right position in sorted  part
public class Insertionsort {
    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr = array[i];
            int prev = i-1;
            while (prev>=0 && array[prev]>curr){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int array[] = {6,3,7,8,9};
        insertionsort(array);
        printarray.print(array);
    }
    
}
