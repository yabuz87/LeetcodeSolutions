class Solution {
    public int thirdMax(int[] nums) {
        // Integer max1 = null, max2 = null, max3 = null;
        // for (Integer num : nums) {
        //     if (num.equals(max1) || num.equals(max2) || num.equals(max3)) continue;
        //     if (max1 == null || num > max1) {
        //         max3 = max2;
        //         max2 = max1;
        //         max1 = num;
        //     } else if (max2 == null || num > max2) {
        //         max3 = max2;
        //         max2 = num;
        //     } else if (max3 == null || num > max3) {
        //         max3 = num;
        //     }
        // }
        // return max3 == null ? max1 : max3;




        /* this one is also a simple way of solving but a bit costly
        let's  say the array be nums=[1,3,4,6,8];
        */
        int n=nums.length;
        int counter=1;
        Arrays.sort(nums);//this one demands around O(n^2) time complexity
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]!=nums[i-1])
            {
                counter++;
            }

            if(counter==3)
            {
                return nums[i-1];
            }

        }
        return nums[n-1];
        
    }
}
