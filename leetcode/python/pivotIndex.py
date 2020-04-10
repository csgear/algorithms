
# leetcode.com 724. Find Pivot Index


class Solution:
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s = sum(nums)
        leftSum = 0

        for i, x in enumerate(nums):
            if leftSum == (s - leftSum - x):
                return i
            leftSum += x

        return -1
