import java.util.Arrays;
public class insertionsort {
   public static void insertionsort(int arr[])
   {
    for(int i = 1 ;i<arr.length ; i++)
    {
        int curr = arr[i];
        int prev = i - 1;
        //finding out current position to insert
        while(prev>=0 && arr[prev]>curr)
        {
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr;

    }
   } 
   public static void main(String args[])
    {
        int arr[] = {6,3,2,1,4,5};
        // insertionsort(arr);
        Arrays.sort(arr,1,5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
