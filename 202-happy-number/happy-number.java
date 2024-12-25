class Solution {
    public boolean isHappy(int n) {
        int num = 0;
        int reminder;
        while (n != 1) {
            num = 0; // Reset num for the next iteration
            while (n > 0) {
                reminder = n % 10;
                num += reminder * reminder;
                n /= 10; // Move to the next digit
            }
            n = num; // Update n with the sum of squares
            if (n == 4) { // To detect a cycle
                return false;
            }
        }
        return true;
    }
}
