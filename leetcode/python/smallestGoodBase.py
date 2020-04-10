
# leetcode.com 483. Smallest Good Base

import math

class Solution(object):
    def smallestGoodBase(self, n):
        """
        :type n: str
        :rtype: str
        """
        num = int(n) 
        for m in range( int(math.log(num, 2)), 1, -1):
        	k = int(num ** (1.0 / m) )
        	if(sum(k ** i for i in range(m+1))) == num:
        		return str(k)

        return str(num-1)


if __name__ == "__main__":
	sol = Solution() 
	print(sol.smallestGoodBase("4681"))
	print(sol.smallestGoodBase("13"))
	print(sol.smallestGoodBase("1000000000000000000"))