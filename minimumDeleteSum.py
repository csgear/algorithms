
class Solution(object):
    def minimumDeleteSum(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: int
        """
        l1, l2 = len(s1), len(s2)

        dp1 = [0]

        for x in range(l1):
        	dp1.append(dp[-1] + ord(s1[x])) 

        for x in range(1, l2 + 1):
        	dp2 = dp1[0] + ord(s2[x-1])
        	for y in range(1, l1 + 1):
        		if s1[y-1] == s2[x-1]: 
        			dp2.append(dp1[y-1]) 
        		else:
        			dp2.append(min(dp1[y] + ord(s2[x-1], dp2[y-1] + ord(s1[y-1]))))
        	dp1 = dp2 

        return dp[-1]
