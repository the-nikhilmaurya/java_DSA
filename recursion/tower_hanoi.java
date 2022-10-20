import java.util.Scanner;

// using recursion to solve the tower of hanoi 
// in this we will be given the tower i.e columns and a number of disks that we have to arrange
// from 1st tower to the i.e source tower to destination tower in such way that we can not place 
// a disk with higher number on lower one and we will have to move one disk at a time
/* let's understand this from suppose i have 3 disks that i have to put to destination taking from
source. So i will take disk3 from source and will put to helper 
and then disk2 to destination .now i have to treat destination as helper will take disk3 and will put to helper
then disk1 to destination disk3 to source ,disk2 to destination and at last disk3 to destination 
 */
public class tower_hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arrange_tower(n, "A", "B", "C");
        sc.close();
    }

    public static void arrange_tower(int n,String src,String help,String dest)
    {
        if(n == 1)
        {
            System.out.println("Move disk "+n+" from "+src +" to "+ dest);
            return;
        }
        arrange_tower(n-1, src, dest, help);
        System.out.println("Move disk "+n+" from "+src +" to "+ dest);
        arrange_tower(n-1, src, help, dest);
    }

}
