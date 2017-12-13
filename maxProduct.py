
# leetcode.com 152. Maximum Product Subarray


class Solution:
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = nums[0] 
        mx = res
        mn = res 
        
        for i in range(1, len(nums)):
            if(nums[i] < 0):
                mx, mn = mn, mx
            
            mx = max(nums[i], mx * nums[i]) ;
            mn = min(nums[i], mn * nums[i]) ;
            res = max(res, mx)
        
        return res