class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int   n=nums.length;
        int  pointer=0;
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
             result[pointer]=nums[i];
                pointer++;
            }
        
        }
         for(int i=0;i<n;i++)
         {
                if(nums[i]%2==0)
                continue;
             else
             {
                 result[pointer]=nums[i];
                 pointer++;
               }
                        
              
           }
        
        return result;
        
    }
}