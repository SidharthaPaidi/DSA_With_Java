import java.util.Arrays;

public class mergetwosorrtedarrayas {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = 0;
        int left = 0;
        int index = 0;
        int nums3[] = new int[m + n];
        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                nums3[index] = nums1[left];
                left++;
            } else {
                nums3[index] = nums2[right];
                right++;
            }
            index++;
        }
        while (left < m) {
            nums3[index++] = nums1[left++];
        }
        while (right < n) {
            nums3[index++] = nums2[right++];
        }

        for (int i = 0; i < n + m; i++) {
            System.out.print(nums3[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 0, 0, 0 };
        int arr2[] = { 2, 5, 6 };
        int m = 3; // Set the correct value of m (number of elements in arr1)
        int n = 3; // Set the correct value of n (number of elements in arr2)

        Arrays.sort(arr1); // Sort arr1 before merging

        merge(arr1, m, arr2, n);
    }
}
