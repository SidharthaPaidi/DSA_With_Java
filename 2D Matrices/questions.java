public class questions {
    public static void que1(int matrix[][])
    {   int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==8)

                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    // public static int  removeDuplicates(int[] nums) {
    //     int i = 0;
    //     for(int j = 1; j<nums.length;j++)
    //     {
    //         if(nums[i]!=nums[j])
    //         {
    //             i++;
    //             nums[i] = nums[j];
    //         }
    //     }
    //     return i+1;
    // }
    public static void main(String[] args) {
        // int a[][] = {{4,7,8},{8,8,7}};
        // que1(a);
        int a[] = {4,4,4,7,8};
        // removeDuplicates(a);
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }

    }
}
