/* In this I have to find the min and max element of array then
 * with this help i will create an count array which will keep
 * the record of occurence i.e frequency of an element
 * then my main loop will come to the  picture the will will
 * see the ith positon of count is greater than one then i will update 
 * the ith  position of array by the index value of count
 */
public class counting_sort {
    public void Countingsort(int array[]) {

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
        // printarray.print(count);

        // placing the value in increasing order
        int j = 0;
        for (int i = count.length-1; i >=0; i--) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
        printarray.print(array);

    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 9, 1, 8, 5, 6, 7 };
        counting_sort s = new counting_sort();

        s.Countingsort(array);
    }

}
