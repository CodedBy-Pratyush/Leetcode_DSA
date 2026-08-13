class Solution {
    public int removeElement(int[] nums, int val) {
        int  c= 0;
        for(int i =0;i<nums.length ; i++){
            if(nums[i]!=val){
nums[c] = nums[i];
c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna