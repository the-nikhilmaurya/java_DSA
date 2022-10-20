
class k_InsortedMatrix {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("("+ row + "," + col +")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static boolean staircaseSearch2(int matrix[][], int key) {
        int row = matrix.length-1, col = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("("+ row + "," + col +")");
                return true;
            }

            else if (key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        // int matrix1 [][]= {
        //     { 10, 20, 30 },
        //     { 15, 25, 35},
        //     { 27, 29, 37,},
        // };
        int key = 15;
        staircaseSearch2(matrix, key);
    }
}