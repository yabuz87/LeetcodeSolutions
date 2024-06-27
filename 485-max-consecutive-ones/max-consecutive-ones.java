class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
          int temp=0; int result=0;int counter=0;
     
        for (int i=0;i<nums.length;i++)
        {  if(nums[i]==1)
           {
            counter++;
            result=Math.max(counter,result);
           }
           else 
             counter=0;
           }
           
           

                return result;
        }
        
    }
