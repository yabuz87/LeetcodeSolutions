import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;

        // Create a copy and sort it
        int[] cpyar = Arrays.copyOf(heights, n);
        Arrays.sort(cpyar);

        // Count the differences
        for (int i = 0; i < n; i++) {
            if (heights[i] != cpyar[i]) {
                count++;
            }
        }

        return count;
    }
}
