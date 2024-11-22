import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();

        // Pancake sorting
        int wall = arr.length;
        while (wall > 0) {
            int higherIndex = 0;
            for (int i = 0; i < wall; i++) {
                if (arr[i] > arr[higherIndex]) {
                    higherIndex = i;
                }
            }
            if (higherIndex != wall - 1) {
                // Move the largest element to the top
                if (higherIndex != 0) {
                    flip(arr, higherIndex + 1);
                    result.add(higherIndex + 1);
                }
                // Move the largest element to its correct position
                flip(arr, wall);
                result.add(wall);
            }
            wall--;
        }

        return result;
    }

    // Helper function to flip the array up to k
    private void flip(int[] arr, int k) {
        int high = k - 1;
        int i = 0;
        while (i < high) {
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            high--;
            i++;
        }
    }
}
