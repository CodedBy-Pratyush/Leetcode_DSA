class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        long val = 1;

        row.add(1);

        for (int i = 0; i < rowIndex; i++) {

            val = val * (rowIndex - i) / (i + 1);
            row.add((int) val);
        }

        return row;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna