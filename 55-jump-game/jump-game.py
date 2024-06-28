class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        j=0
        # size=len(nums)-1
        for i in nums:
            if j<0:
                return False
            j=max(j,i)
            j-=1 
        return True
        