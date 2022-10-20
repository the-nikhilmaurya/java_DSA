import javax.lang.model.util.ElementScanner14;

// check if given array is sorted
public class SortedArray {
    public static boolean check(int array[],int n){
        if(n==array.length-1)
            return true;
        else{
            if(array[n]<=array[n+1])
                check(array,n+1);
            else 
                return false;
            }
        return check(array, n+1);
    }

    public static int firstOccurence(int array[],int i,int key){
        if( i==array.length)
            return -1;
        if(array[i] == key)
            return i;
        return firstOccurence(array, i+1, key);
    }

    public static int lastOccurence(int array[],int i,int key,int ip){
        if(i==array.length)
            return ip;
        if(array[i]==key)
            ip = i;
        return lastOccurence(array, i+1, key, ip);
    }

    public static int lastOccurence(int array[],int i,int key){
        if(i==array.length)
            return -1;
        int isfound = lastOccurence(array, i+1, key);
        if(isfound != -1)
                return isfound;
        if(array[i]==key)
            return i;
        return isfound;
    }
    public static void main(String[] args) {
        int array [] = {1,2,3,3,4,5,3};
        // System.out.println(check(array,0));
        // System.out.println(firstOccurence(array, 0, 7));
        // System.out.println(lastOccurence(array, 0, 3, -1));
        System.out.println(lastOccurence(array, 0, 3));
    }
}
