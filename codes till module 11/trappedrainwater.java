import java.util.*;

public class trappedrainwater {
 public static int Trappedwater(int height[])
 {
    // leftMax Boundary
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for (int i = 1; i < height.length; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
     
    }
    // rightMax Boundary
    int rightMax[] = new int[height.length];
    rightMax[height.length-1]=height[height.length-1];
    for(int i = height.length-2;i>=0;i--)
    {
        rightMax[i] = Math.max(height[i],rightMax[i+1]);
    }
    //loop
    int trappedwaterr = 0;
    for (int j = 0; j < height.length; j++) {
        //water level
        int WaterLevel = Math.min(leftMax[j],rightMax[j]);
        //trapped water
       trappedwaterr = trappedwaterr + (WaterLevel-height[j]); 
        
    }
    return trappedwaterr;

 }
 public static void main(String args[])
 {
    int arr[] = { 4,2,0,6,3,2,5};
    System.out.println(Trappedwater(arr));
 }
}
