
# leetcode.com  714. Best Time to Buy and Sell Stock with Transaction Fee

class Solution(object):
    def maxProfit(self, prices, fee):
        """
        :type prices: List[int]
        :type fee: int
        :rtype: int
        """
        cash = 0
        hold = - prices[0]

        for i in range(1, len(prices)):
            cash = max(cash, hold + prices[i] - fee)
            hold = max(hold, cash - prices[i])
        return cash 
