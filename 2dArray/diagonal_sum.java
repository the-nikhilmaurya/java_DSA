/* Given an 2d matrix i have to find the sum of its diagonal values and same values must not be repeated
 * diagonal starting from left side is primary and the from right is known as secondary
 */
public class diagonal_sum {
    public static int diagonal(int array[][]){
        // using brute force 
        int sum =0;
        // for(int i=0;i<array.length;i++){
        //     for (int j=0;j<array[0].length;j++)
        //     {
        //         if(i==j)
        //             sum += array[i][j];
        //         else if(i+j==array.length-1)
        //             sum += array[i][j];
        //     }
        // }
        // return sum;
        

        // using optimized code of O(n)
        for(int i=0;i<array.length;i++)
        {
            sum += array[i][i];
            if(i!=array.length-1-i)
                sum += array[i][array.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int array[][] = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };
        System.out.println(diagonal(array));
    }
    
}
