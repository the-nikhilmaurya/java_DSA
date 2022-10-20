/* Given a "2*n" board and tiles of size "2*1".count the number of ways to tile the given board
 * using the 2*1 tiles
 */
public class tilingProblem {
    public static int placeTiles(int n){
        // base class 
        if(n==0 || n==1)
            return 1;
        // vertical choice
        int vertical = placeTiles(n-1);

        // horizontal choice
        int horizontal = placeTiles(n-2);

        return vertical+horizontal;
    }

    public static void main(String[] args) {
        System.out.println(placeTiles(4));
    }
}
