class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        size1=len(haystack)
        size2=len(needle)
        for i in range(size1-size2+1):
                for j in range(size2):
                    if haystack[i+j]!=needle[j]:
                        break
                else:
                        return i
                
                
        return -1
        