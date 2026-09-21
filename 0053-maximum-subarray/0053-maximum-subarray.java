class Solution {
    public int maxSubArray(int[] nums) {
     int sum = 0 ;
     int max=  nums[0];
for(int x : nums ){
    sum += x ;
max = Math.max(sum , max );
    if(sum < 0 ){
        sum = 0;
    }
}
return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna