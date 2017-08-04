
# leetcode.com 537. Complex Number Multiplication

class Solution(object):
    def complexNumberMultiply(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        m, n = map(int, a[:-1].split('+'))
        p, q = map(int, b[:-1].split('+'))

        return '{0}+{1}i'.format(m * p - n * q, m * q + n * p)