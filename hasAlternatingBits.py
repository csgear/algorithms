# leetcode.com  LeetCode 693. Binary Number with Alternating Bits

class Solution(object):
    def hasAlternatingBits(self, n):
    	"""
    	:type n: int
    	:rtype: bool
    	"""
    	last = n & 1
    	n >>= 1

    	while n:
    		bit = n & 1
    		if bit == last:
    			return False 

    		last = bit 
    		n >>= 1

    	return True
