public class arrays3 {
    public static int linear(int arr[],int key)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5,6,7,8};
        int index = linear(num, 5);
        System.out.println(index);

    }
}
