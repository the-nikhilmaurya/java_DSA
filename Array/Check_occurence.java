// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
// Example 1:Input:nums = [1, 2, 3, 1]Output:   true
public class Check_occurence {
    public static boolean Repetition(int array[]){
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,1,4,2,4};
        System.out.println(Repetition(array));
    }
    
}
