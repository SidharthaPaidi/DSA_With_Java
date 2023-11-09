public class arrays9 {
        public static void maxSumSubarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) 
                {
                for (int j = 0; j < arr.length; j++) 
                {
                currSum = 0;
                for (int k = i; k <=j; k++)
                {
                    currSum = currSum + arr[k];
                }
               
                if (maxSum < currSum) 
                {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum " + maxSum);
    }

        public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSumSubarray(arr);
    }

}
