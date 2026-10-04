class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        
        for(int nums : arr){
            if(  nums > max ){
                max = nums ; 
            }
        }
        
        return max ;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna