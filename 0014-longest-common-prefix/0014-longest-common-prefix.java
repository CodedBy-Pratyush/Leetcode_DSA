class Solution {
    public String longestCommonPrefix(String[] strs) {
   
String prefix = "";

for (int i = 0; i < strs[0].length(); i++) {

    for (int j = 1; j < strs.length; j++) {

        if (i >= strs[j].length() ||
            strs[0].charAt(i) != strs[j].charAt(i)) {
            return prefix;
        }
    }

    prefix += strs[0].charAt(i);
}

return prefix;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna