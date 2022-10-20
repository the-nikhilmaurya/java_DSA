// print numbers from n to 1 i.e Decreasing order
public class problem1 {
    public static void decreasing_order (int n){
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        else
        {
            System.out.print(n+" ");
            decreasing_order(n-1);
        }
    }

    
    public static void main(String[] args) {
        decreasing_order(5);
    }
}
