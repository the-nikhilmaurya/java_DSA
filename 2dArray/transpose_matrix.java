public class transpose_matrix {
    public static void transpose(int nums[][]){
        int array [][]=new int[nums[0].length][nums.length];
        // System.out.println(nums[0].length+" "+nums.length);
        for(int i=0;i<array[0].length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                array[j][i] = nums[i][j];
                // System.out.print("("+i+","+j+")");
            }
            // System.out.println();
        }
        printmatrix.print(array);
    }
    public static void main(String[] args) {
        int matrix0[][]={ {1,2},
                          {3,4},
                          {5,6}};
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int matrix3[][]={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}};

        transpose(matrix3);
    }
}
