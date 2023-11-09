public class array2 {

    public static void update(int arr[])
    {
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String args[])
    {
        int marks[] = {1,2,3};
        update(marks);
        for(int i =0;i<marks.length;i++)
        {
            System.out.println(marks[i]+" ");
        }


    }
    
}
