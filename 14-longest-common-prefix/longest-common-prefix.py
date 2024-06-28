class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        size1 = len(strs)
        short = sorted(strs)
        size2 = len(short)
        name = ""

        if size1 == 0:
            name = strs[0][0]
            return name

        for i in range(len(short[0])):
            for j in range(size2):
                if short[0][i] != short[j][i]:
                    return name
            name += short[0][i]

        return name
        