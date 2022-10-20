/* In this we will be given a array from that we have to 
 * figure out the amount of rainwater that we can save during
 * rain. To do this we need create an axulirray array i.e helping arrays
 * the first we will be the value of left maximum  i.e for the i position 
 * what will be left max boundary similarily I have to figure out right maximum
 * so that i can decide the amount of water that i can save between of this two 
 * By applying the formula height of i position minus the max value between the 
 * left and right max boundary
 */
public class TrappedRainwater {
    // creating a method to calculate 
    public static void CalVolume(int height[]){
        // left max boundary
        int leftMax [] = new int[height.length];
        leftMax[0] = height[0];                         // since it will start from left
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
            // System.out.println(leftMax[i]);
        }
        // System.out.println("right");

        // right max boundary
        int rightMax [] = new int [height.length];
        rightMax[height.length-1] = height[height.length-1];        // since it will start from right side
        for(int i=height.length-2;i>=0;i--){
            rightMax [i] = Math.max(height[i], rightMax[i+1]);
            // System.out.println(rightMax[i]);
        }

        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            // waterlevel = min(leftmax,rightmax)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            System.out.println("waterlevel "+waterlevel);
            // trappedWater = (waterlevel-heigth[i]) *width(1)
            trappedWater = trappedWater + (waterlevel-height[i]);
            System.out.println("trapped "+trappedWater);
        }
        System.out.println(" Trappped Water is : "+trappedWater);

    }
    public static void main(String[] args) {
        int height []= {4,2,0,6,3,5};
        CalVolume(height);
    }
}
