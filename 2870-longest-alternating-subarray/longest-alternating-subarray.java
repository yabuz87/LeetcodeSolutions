class Solution {
    public int alternatingSubarray(int[] nums) {
        int max = -1, cnt = -1, j;
        if(nums.length == 2 && nums[1] - nums[0] == 1)  return 2;
        for(int i=2; i<=nums.length; i++){
            if(i == nums.length && nums[i-1] - nums[i-2] == 1){
                max = Math.max(max,2);
                break;
            }
            if(nums[i-1] - nums[i-2] == 1){
                cnt = 2;
                j = i;
                while(j < nums.length && nums[j] == nums[j-2]){
                    j++;
                    cnt++;
                }
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}