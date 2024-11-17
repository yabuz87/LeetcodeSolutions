class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[index]>nums[j])
                {
                    index=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
        }
        
    }
}