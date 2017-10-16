
# leetcode.com LeetCode 639. Decode Ways II


class Solution(object):
    def __init__(self):
        dmap = collections.defaultdict(int)
        ch = '0123456789*'
        for m in ch:
            if m == '*': dmap[m] = 9
            elif '1' <= m <= '9': dmap[m] = 1
            for n in ch:
                s = m + n
                if m == '*':
                    if n == '*': dmap[s] = 15
                    elif '0' <= n <= '6': dmap[s] = 2
                    else: dmap[s] = 1
                elif m == '1':
                    if n == '*': dmap[s] = 9
                    else: dmap[s] = 1
                elif m == '2':
                    if n == '*': dmap[s] = 6
                    elif '0' <=  n <= '6': dmap[s] = 1
        self.dmap = dmap

    def numDecodings(self, s):
        """
        :type s: str
        :rtype: int
        """
        MOD = 1000000007
        ans = 0
        dp1 = dp2 = 1
        lc = '*'

        # dp[x] = (dp[x - 2] * dmap[s[x - 1 : x]] + dp[x - 1] * dmap[s[x]]) % MOD
        for _, c in enumerate(s):
            ans = (dp1 * self.dmap[c] + dp2 * self.dmap[lc + c]) % MOD
            lc = c
            dp1, dp2 = ans, dp1
        return ans