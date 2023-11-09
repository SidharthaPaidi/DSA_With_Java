import java.util.*;
public class arrays4 {
    public static int Getlargest(int arr[])
    {    int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[])
    {
      
       int num[] = {2,5,3,76,43,24};
       System.out.println("The largest value in array is  "+ Getlargest(num));
    }
}
