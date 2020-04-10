//
//  leetcode.com : 51. N-Queens
//

#include <vector>
#include <string>
#include <cstdlib>

using namespace std ;

class Solution {
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> result ;
        
        vector<int> m(n, -1) ;
        
        solveNQueensDFS(result, m, 0, n) ;
        
        return result ;
    }
    
    void solveNQueensDFS(vector<vector<string>>& result, vector<int> cols, int curr, int n) {
        
        if(curr == n)
        {
            vector<string> s(n, string(n, '.')) ;

            for(int i = 0 ; i < n ; i++)
            {
                s[i][cols[i]] = 'Q' ;
            }
            result.push_back(s) ;
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
