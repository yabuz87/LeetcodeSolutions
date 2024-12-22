class Solution { public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap <Integer,Integer> check=new HashMap<>(); 
     for(int i=0;i<nums.length;i++)
                { 
             if(check.containsKey(nums[i]))
             {    
             int difference=i-check.get(nums[i]); 
             if(difference<=k){ return true;}
              } 
           
                    check.put(nums[i],i);
                     
                 }
                  return false;
     } 
}