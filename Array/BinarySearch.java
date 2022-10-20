/*
 * Binary search is a prerequisite search in which arrays are sorted either in ascending or descending oreder
 * we have to define a start,end and mid value ,the key will first check with mid if it accepts then it will return
 * or it will check another if statement where if key is greater than mid then it will update start as mid+1
 * if less then then end value will be updated with mid-1
 * this will continue untill it finds the correct and that is till start <= end otherwise it will return -1
 */
// for ascending order
public class BinarySearch {
    public static int usingBinary(int numbers[],int key)
    {
        int start =0;
        int end = numbers.length-1;
        while (start<=end)
        {
            int mid = (start+end)/2;
            if(key == numbers[mid])
                return mid;
            if (key < numbers[mid])  // Second half
                end = mid-1;
            else                    // First half
                start = mid+1;
            }
            return -1;
        }

    public static void main(String[] args) {
        int numbers []  = {1,2,12,35,56,67,90};
        int key = 90;
        System.out.println("key is at index : "+usingBinary(numbers, key));
    }
    
}
