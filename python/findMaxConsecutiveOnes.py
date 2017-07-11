
### leetcode.com  485. Max Consecutive Ones

class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = cnt = 0
        for n in nums:
            if n == 1:
                cnt += 1
                ans = max(ans, cnt)

            if n == 0:
                cnt = 0

        return ans