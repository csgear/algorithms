
# leetcode.com 728. Self Dividing Numbers

class Solution:
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        def check(num):
            digits = set(map(int, str(num)))
            if 0 in digits: return False
            return not any(num % d for d in digits)
        
        return filter(check, range(left, right+1))
            