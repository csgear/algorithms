//
//  leetcode.com : 52. N-Queens II
//

#include <vector>
#include <string>
#include <cstdlib>

using namespace std ;

class Solution {
public:
    int totalNQueens(int n) {
        int result = 0 ;
        
        vector<int> m(n, -1) ;
        
        solveNQueensDFS(result, m, 0, n) ;
        
        return result ;
    }
    
    void solveNQueensDFS(int& result, vector<int>& cols, int curr, int n) {
        
        if(curr == n)
        {
            result ++ ;
        }
        else
        {
            for(int col = 0 ; col < n ; col++)
            {
                if(isValid(cols, curr, col))
                {
                    cols[curr] = col ;
                    solveNQueensDFS(result, cols, curr + 1, n) ;
                    cols[curr] = -1 ;
                }
            }
        }
        
    }
    
    bool isValid(vector<int>& cols, int row, int col)
    {
        
        for(int i = 0 ; i < row ; i++)
        {
            if (col == cols[i] || abs(row - i) == abs(col - cols[i])) {
                return false;
            }
        }
        
        return true ;
    }
    
} ;
