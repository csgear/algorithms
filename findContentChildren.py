
# leetcode.com 455. Assign Cookies


class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        cnt = 0
        g = sorted(g) 
        s = sorted(s)

        i = len(g) - 1
        j = len(s) - 1

        while min(i, j) >= 0:
        	if g[i] <= s[j]:
        		cnt += 1
        		j -= 1
        	i -= 1

        return cnt