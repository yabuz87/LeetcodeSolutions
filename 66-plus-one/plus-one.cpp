class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int size = digits.size();
        int add = 0;
        
        if(digits[size-1] != 9) {
            digits[size-1] += 1;
            return digits;
        }
        else {
            for(int i = size-1; i >= 0; i--) {
                if(digits[i] == 9) {
                    digits[i] = 0;
                    add = 1;
                }
                else {
                    digits[i] += 1;
                    add = 0;
                    break;
                }
            }
            
            if (add == 1) {
                digits.insert(digits.begin(), 1);
            }

            return digits;
        }
        
    }
};