class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int size = nums.size();
        int slow = 0; // slow pointer
        
        for (int fast = 0; fast < size; fast++) { // fast pointer
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        
        return slow;
        
    }
};