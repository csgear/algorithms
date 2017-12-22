
# leetcode.com 70. Climbing Stairs

class Solution:
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        a, b = 1, 1

        for i in range(n):
        	b += a
        	a = b - a

        return a