
# leetcode.com 762. Prime Number of Set Bits in Binary Representation

class Solution:
    def countPrimeSetBits(self, L, R):
        """
        :type L: int
        :type R: int
        :rtype: int
        """
        primes = {2,3,5,7,11,13,17,19,23,29}
        ans = 0
        for n in range(L,R+1):
            c = bin(n).count('1')
            if c in primes:
                ans += 1
                
        return ans