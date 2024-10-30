class Solution {
    public int[] sortedSquares(int[] nums) {
       
        int n=nums.length;
         int[] result=new int[n];
        int high=n-1;
        int low=0;
        int count=n-1;
        int temp;
        while(low<high)
        {
        
            // temp=Math.abs(nums[low]);
            if(Math.abs(nums[low])>Math.abs(nums[high]))
            {
             result[count]=nums[low]*nums[low];
                count--;
                low++;
            }
            else{
            
                result[count]=nums[high]*nums[high];
                high--;
                count--;
                }
        }
        result[count]=nums[low]*nums[low];
        return result;
        
    }
}