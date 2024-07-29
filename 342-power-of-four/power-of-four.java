class Solution {
   public boolean isPowerOfFour(int n) {
    if (n <= 0) {
        return false; // Negative numbers or zero are not powers of 4
    }
    
    int res = n;
    while (res % 4 == 0) {
        res /= 4;
    }
    
    return res == 1;
}

}