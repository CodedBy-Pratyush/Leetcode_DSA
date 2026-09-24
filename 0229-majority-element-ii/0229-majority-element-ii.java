class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int c1 = 0, c2 = 0;
        int v1 = 0, v2 = 0;

        for(int i : nums ){
if(v1==i){
c1++;
}
else if (v2==i){
    c2++;
}
else if(c1==0){
v1=i;
c1++;
}
else if(c2==0){
v2=i;
c2++;
}
else{
    c1--;
    c2--;
}

        }

       c1 = 0;
        c2 = 0;

        for (int x : nums) {
            if (x == v1) {
                c1++;
            }
            if (x == v2) {
                c2++;
            }
        }

        List<Integer>R = new ArrayList<>();
       
            if(c1>nums.length/3){
                R.add(v1);
            }
             if(c2>nums.length/3 && v2!=v1){
                R.add(v2);
            }
        
return R;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna