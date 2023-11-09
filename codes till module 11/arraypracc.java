public class arraypracc {

    public static boolean Ques1(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int Ques2(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                // left sorted
                if (arr[mid] >= arr[low])

                {
                    if (target >= arr[low] && target <= arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }

                }
                // right sorted
                else if (arr[mid] <= arr[high]) {
                    if (target >= arr[mid] && target <= arr[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

        }
        return -1;
    }

    public static int Ques3(int prices[]) {
        int profit = 0;
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }

 public static int maxSubarraySum(int arr[]) {
        int current_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;
        int k = 0;
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                minimum = Math.max(minimum, arr[i]);

            }
            k++;

        }
        if (k == arr.length) {
            return minimum;
        }

        for (int i = 0; i < arr.length; i++) {
            current_sum = current_sum + arr[i];

            if (current_sum < 0) {
                current_sum = 0;

            }
            maximum_sum = Math.max(maximum_sum, current_sum);
        }
        // Your code here
        return maximum_sum;

    }

    public static void main(String args[]) {
        int num[] = { -1,-3,-2,-5 };
        int target = 1;
        // System.out.println("maximum profit will be on day " + Ques3(num));
        System.out.println(maxSubarraySum(num));

    }

}
