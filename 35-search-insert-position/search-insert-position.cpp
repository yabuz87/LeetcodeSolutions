class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int store = 0;
       int low = 0, high = nums.size() - 1;
       while (low <= high) {
          int mid = low + (high - low) / 2;
           if (nums[mid] == target)
               return mid;
           else if (nums[mid] > target) {
               high = mid - 1;
               store = mid;
           }
           else if (nums[mid] < target) {
               low = mid + 1;
               store = mid + 1;
           }
       }
       return store;
        
    }
};