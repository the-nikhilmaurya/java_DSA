

public class Checkpowerof2 {
    public static boolean nIsPowerof2(int n){
        if((n&(n-1))==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(nIsPowerof2(16));
    }
}
