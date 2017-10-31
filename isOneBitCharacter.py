
# leetcode.com 717. 1-bit and 2-bit Characters


class Solution:
    def isOneBitCharacter(self, bits):
        """
        :type bits: List[int]
        :rtype: bool
        """
        k = 0
        while k < len(bits):
            if k == len(bits) - 1:
                return True
            if bits[k] == 0:
                k += 1
            else:
                k += 2
        return False
