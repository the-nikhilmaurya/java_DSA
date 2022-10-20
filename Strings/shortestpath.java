import javax.lang.model.util.ElementScanner14;

/*Given a route containning four directions(E,N,S,W) 
    find the shortest path to reaach destination
 */
public class shortestpath {
    public static float FindShortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            //north
            if(path.charAt(i)=='N')
                y++;

            //south
            else if(path.charAt(i)=='S')
                y--;
            //East
            else if(path.charAt(i)=='E')
                x++;
            else 
                x--;
        }
        /* now i have to calculate the xsquare and ysquare and apply distance formula 
         * since now the starting point my destindation that is x1 and y1 will always 
         * be zero i can skip x2-x1 thing 
         */
        int x2 = x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(FindShortestpath(path));
    }
    
}
