/* This is rainwater trapping que in which i will be given an arrray with 
 * hellp of this array i will need to create an auxillary array or helping array 
 * one will contain left max value and other will contain right max value
 */
public class DSA_sheets_11 {
    public static void trappingRainwater(int array[])
    {
        // calculating left max array
        int leftMax[] = new int[array.length];
        leftMax[0] = array[0];
        for(int i=1;i<array.length;i++){
            leftMax[i] = Math.max(array[i], leftMax[i-1]);
            // System.out.print(leftMax[i]+" ");
        }
        // System.out.println();
        // right max
        int rightMax [] = new int[array.length];
        rightMax[array.length-1] = array[array.length-1];
        for(int i=array.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], array[i]);
            // System.out.print(rightMax[i]+" ");
        }
        int rainwater = 0;
        for(int i=0;i<array.length;i++){
            rainwater += Math.min(leftMax[i], rightMax[i]) - array[i];
        }
        System.out.println(rainwater);
       
    }
    public static void main(String[] args) {
        // int array[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int array[] = {4,2,0,3,2,5};
        trappingRainwater(array);
    }
}
