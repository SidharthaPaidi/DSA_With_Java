public class selectionsort {
    public static void selectionSort(int arr[])
    {
        for(int i = 0 ;i<arr.length-1;i++)
        {
            int minPosition = i ;
            for(int j = i+1 ; j < arr.length ;j++)
            {
                if(arr[minPosition]>arr[j])
                {
                    minPosition = j ;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
            

        }
    }
    public static void main(String args[])
    {
        int arr[] = {2,4,2,6,-5,8};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
