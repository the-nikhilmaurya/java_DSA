/* Given n friends each one can remain single or can be paired up with some other friend .
 * Each friend can be paired only once.Find out the total number of ways in which friends can remain
 * single or can be paired up
 */
public class FriendspairingProblem {
    public static  int friendsPairing (int n){
        //base class
        if(n==1 || n==2)
            return n;
        
        // choice to be reamained single
        int fnm1 = friendsPairing(n-1);
        
        // choice to be move in pairs
        int fnm2 = friendsPairing(n-2);

        int totalPairsways = (n-1)*fnm2;

        //number of ways
        int totways = fnm1+totalPairsways;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(3);
    }
}
