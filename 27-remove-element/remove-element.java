class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int none=0;
        for(int i=0;i<n;i++)
        {
        
            if(nums[i]!=val)
                nums[none++]=nums[i];
        }
        return none;
        
    }
}