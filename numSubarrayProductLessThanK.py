
# leetcode.com 713. Subarray Product Less Than K


class Solution:
    def numSubarrayProductLessThanK(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        currprod = 1
        l = r = -1 
        ans = 0

        for num in nums:
            r += 1
            currprod *= num 

            while l + 1 <= r and currprod >= k:
                currprod /= nums[l + 1]
                l += 1
                

            ans += r - l

        return ans