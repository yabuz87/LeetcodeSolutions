class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        string=str(x)
        size=len(string)-1
        for i in range(size):
            if string[i]==string[size-i]:
                continue
            else:
                return False
        return True
        