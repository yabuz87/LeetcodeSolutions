class Solution {
public:
    int lengthOfLastWord(string s) {
        int size = s.length();
        int ans = 0;
        
        
        for (int i = size - 1; i >= 0; i--) {
            
            if (s[i] != ' ') {
                ans++;
            }
           
            else if (ans > 0) {
                return ans;
            }
        }
        
        return ans;
    }
};