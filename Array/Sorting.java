
public class Sorting {
    public static void printarray(int array[]){
        int i =0;
        while(i<array.length){
            System.out.print(array[i]+" ");
            i++;
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

    //insertion sort
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

    // counting sort
    public static void countingsort(int array[]) {

        // find max value
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Integer.max(array[i], max);
        }

        // create count array from zero to max element
        int count[] = new int[max + 1];
        for (int i = 0; i <array.length; i++) {
            count[array[i]]++;   // increasing count value of the ith position
        }

        // placing the value in increasing order
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int array[] = {4,5,6,2,9};
        // bubblesort(array);
        // Selectionsort(array);
        // insertionsort(array);
        countingsort(array);
        printarray(array);

       
    }
    
}
