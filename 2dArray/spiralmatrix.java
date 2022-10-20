

public class spiralmatrix {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int matrix2[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int matrix3[][]={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
    //    printmatrix.print(matrix3);
        // spiral(matrix);
        // spiral(matrix2);
        spiral(matrix3);
    }

    // spiral matrix
    public static void spiral(int matrix[][]){
        int startRow =0;
        int endRow = matrix.length-1;
        // System.out.println(endRow);
        int startCol = 0;
        int endCol = matrix[0].length-1;
        // System.out.println(endCol);
       
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // System.out.println();

            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix [j][endCol]+" ");
            }
            // System.out.println();

            //Bottom
            for(int i=endCol-1;i>=startCol;i--)
            {
                if(startRow == endRow)
                    break;
                System.out.print(matrix[endRow][i]+" ");
            }
            // System.out.println();

            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol)
                    break;
                System.out.print(matrix[i][startCol]+" ");
            }
            // System.out.println();

            startCol++;
            startRow++;
            endCol--;
            endRow--;
            // System.out.println("startrow "+startRow+"  startcol "+startCol);
            // System.out.println("endrow "+endRow+"  endcol "+endCol);


            
        }
    }
    
}
