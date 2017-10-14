
import math

# leetcode.com 661. Image Smoother

class Solution:
    def imageSmoother(self, M):
        """
        :type M: List[List[int]]
        :rtype: List[List[int]]
        """
        dx = [-1, 0, 1]
        dy = [-1, 0, 1]

        N = []
        n = len(M)
        m = len(M[0])

        for x in range(n):
            row = []
            for y in range(m):
                nbs = [M[x+i][y+j] for i in dx for j in dy 
                if 0 <= x + i < n and 0 <= y + j < m]
                row.append(math.floor(sum(nbs) / len(nbs)))
            N.append(row)
        return N