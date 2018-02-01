
# leetcode.com 760. Find Anagram Mappings

class Solution:
    def anagramMappings(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]
        """
        nums = {x: i for i, x in enumerate(B)}
        return [nums[x] for x in A]