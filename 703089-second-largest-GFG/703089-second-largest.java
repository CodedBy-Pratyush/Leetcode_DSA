class Solution {
    public int getSecondLargest(int[] arr) {

        int max = arr[0];
        int smax = Integer.MIN_VALUE;

        for (int nums : arr) {

            if (nums > max) {
                smax = max;
                max = nums;
            }
            else if (nums > smax && nums != max) {
                smax = nums;
            }
        }

        if (smax == Integer.MIN_VALUE) {
            return -1;
        }

        return smax;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna