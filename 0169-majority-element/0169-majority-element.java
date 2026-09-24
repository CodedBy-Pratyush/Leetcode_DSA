class Solution {
    public int majorityElement(int[] nums) {
       int count= 0 , val =0;

       for(int i = 0 ; i < nums.length ; i++){

        if(count==0){
val =  nums[i];
count ++;
        }
        else if (val == nums[i]){
            count++;
        }
        else{
            count --;
        }
       } 
       return val; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna