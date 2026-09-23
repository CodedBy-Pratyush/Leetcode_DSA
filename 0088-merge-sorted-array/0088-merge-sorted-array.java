class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result.add(nums1[i]);
                i++;
            } else {
                result.add(nums2[j]);
                j++;
            }
        }

        while (i < m) {
            result.add(nums1[i]);
            i++;
        }

        while (j < n) {
            result.add(nums2[j]);
            j++;
        }

        for (int k = 0; k < result.size(); k++) {
            nums1[k] = result.get(k);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna