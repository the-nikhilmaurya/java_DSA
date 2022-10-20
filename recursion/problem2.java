import javax.sound.sampled.SourceDataLine;

// print the number in increasing order
public class problem2 {
    public static void printInc(int i,int n){
        if(i==n){
            System.out.println(i);
            return;
        }
        else{
            System.out.print(i+" ");
            printInc(i+1, n);
        }
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        // printInc(-5,5);
        printInc(5);
    }
}
