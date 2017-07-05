
### leetcode.com  633. Sum of Square Numbers

class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        for a in range(int(c ** 0.5) + 1):
            b = c - a * a
            if int(b ** 0.5) ** 2 == b:
                return True
        return False