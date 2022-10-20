import java.time.chrono.MinguoChronology;

import javax.lang.model.util.ElementScanner14;

/*
there is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot  
index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   
nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might
be rotated  at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible 
rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.
You must write an algorithm with O(log n) runtime complexity 
*/
public class DSA_sheets_6 {

    // method for finding index of minivalue in nums array 
    public static int minSearch(int nums[]){
        int min = Integer.MAX_VALUE;
        // int min_index = -1;
        // for(int i=0;i<nums.length;i++){
        //     if(min>nums[i]){
        //         min = nums[i];
        //         min_index = i;
        //     }
        // }
        // return min_index;
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = (left + right)/2;
            if(mid > 0 && nums[mid -1]>nums[mid])
                return mid;
            else if(nums[left]<=nums[mid] &&  nums[mid]>nums[right])
                left = mid+1;
            else 
                right = mid -1;
        }
        return left;
    }

    // as i have minimum value index in nums array
    // now i can compare this value with my target and can have that result
    public static int Search (int nums[],int target){
        int min = minSearch(nums);  // now min will store index of minimum value
        // to find in sorted array
        if(nums[min]<= target && target <= nums[nums.length-1])
            return Search(nums,min,nums.length-1,target);
        
            else
                return Search(nums,0,min,target);

    }

    public static int Search(int[] nums, int left, int right, int target) {
        while(left<=right)
        {
            int mid =(left+right)/2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid]>target)
                right = mid-1;
            else 
                left = mid+1;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {6,1,2,3,4,5};
        // System.out.println(nums[minSearch(nums)]);
        // minSearch(nums);
        int target = 2;
        System.out.println(Search(nums, target));
        
        
    }

}
