class Solution {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;

        while (m <= h) {

            if (nums[m] == 0) {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;

                l++;
                m++;
            }
            else if (nums[m] == 1) {
                m++;
            }
            else {
                int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;

                h--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna