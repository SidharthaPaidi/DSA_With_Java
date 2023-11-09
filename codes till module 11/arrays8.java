public class arrays8 {
    public static void Subarray(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }

        }
        System.out.println("");
        System.out.println("Total subarrays" + ts);
    
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Subarray(arr);
    }
}
