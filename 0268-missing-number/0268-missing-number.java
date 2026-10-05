class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int sum =0 ;
        int expectedSum = n * (n+1)/2 ;
        for (int i = 0 ; i < n ; i++){
            sum += nums[i];
        }
int miss =  expectedSum - sum ;

return miss ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna