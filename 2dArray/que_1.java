/*Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2 */
public class que_1 {
    public static int countkey(int array[][],int key){
        int count =0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                if(key==array[i][j])
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
      int array [][] = {{4,7,8},{8,8,7}};
        System.out.println(countkey(array, 8));  
    }
}
