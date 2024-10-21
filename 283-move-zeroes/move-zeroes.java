class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nonZero=0;
        for(int i=0;i<n;i++)
           {
            if(nums[i]!=0)
            {
                nums[nonZero++]=nums[i];
            }
           }
           for(int i=nonZero; i<n;i++)
           {
            nums[i]=0;
           } 
        
        
    }
}