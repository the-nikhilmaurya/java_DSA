// print sum of arrays in second row of nums2d array
public class que_2 {
    public static void sum2row(int nums[][])
    {
        int sum =0;
        for(int i=0;i<nums[0].length;i++)
        {
            sum = sum + nums[1][i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int nums [][] = {{4,7,8,3},{8,8,7,2}};
        sum2row(nums);  
      }
    
}
