public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) { // Check for empty string
            return 0; // Return 0 for empty string
        } else if (s.equals(" ")) { // Check for single space
            return 1; // Return 1 for single space
        }
       
        HashMap<Character, Integer> container = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char current = s.charAt(right);
            if (container.containsKey(current)) {
                left = Math.max(left, container.get(current) + 1);
            }
            container.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1); // Update maxLength correctly
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
