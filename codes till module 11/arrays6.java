public class arrays6 {

    public static void reverse(int arr[]) {
        int last = arr.length - 1;

        for (int i = 0; i < last; i++) {
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;

        }

    }

    public static void reverse_2(int arr[])

    {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1,2,3};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
