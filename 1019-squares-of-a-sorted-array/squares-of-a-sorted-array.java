class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int size=nums.length;
        int end=size-1;
        int[] result=new int[size];
        while(start<=end)
        {
            if(Math.abs(nums[start])>Math.abs(nums[end]))
            {
                result[size-1]=nums[start]*nums[start];
                start++;

            }
            else
            {
                result[size-1]=nums[end]*nums[end];
                end--;
            }
            size--;
        }

        return result;
    }
}