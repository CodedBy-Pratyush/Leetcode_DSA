class Solution {
    public int maxAbsoluteSum(int[] nums) {
      int sum = 0 ;
      int maxsum = 0, minsum = 0;

      for(int i = 0 ; i < nums.length ; i ++){
        sum +=nums[i];
        maxsum = Math.max(sum , maxsum);
        minsum = Math.min(sum , minsum);
      }  
    return maxsum - minsum;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna