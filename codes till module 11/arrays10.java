public class arrays10 {
    public static void PrefixSum(int arr[])
    {
        int start = 0;
        int end = 0 ;
        int currSum = 0;
        int Maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
           

            for(int j = 1 ; j < arr.length;j++)
            {
              
                currSum = 0 ;
              end = j ;
                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                if(Maxsum<currSum)
                {
                    Maxsum = currSum ;
                }
            }
        }
        System.out.println("Maximum Sum " + Maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
       PrefixSum(arr);
    }
}
