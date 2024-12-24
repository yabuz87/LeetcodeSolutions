class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(score);
                score = 0; // Reset score for the new level of nesting
            } else {
                score = stack.pop() + Math.max(2 * score, 1);
            }
        }

        return score;
    }
}
