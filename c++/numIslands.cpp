
// leetcode.com 200. Number of Islands

#include <stdio.h>

#include <vector>
#include <algorithm>
#include <iostream>
#include <queue>

using namespace std ;

class Solution {
    
public:
    bool isValid(int x, int y, int row, int col)
    {
        return x >= 0 && x < row && y >= 0 && y < col ;
    }
    
    int numIsLandsBFS(vector<vector<char>>& grid) {
        int ans = 0 ;
        
        if(grid.empty() || grid[0].empty()) return 0 ;
        
        int m = grid.size(), n = grid[0].size() ;
        
        vector<vector<int>> directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } } ;
        
        queue<pair<int, int>> q ;
        
        vector<vector<bool>> visited(m, vector<bool>(n, false)) ;
        
        for(int i = 0 ; i < m ; ++i)
        {
            for(int j = 0 ; j < n ; ++j)
            {
                
                if(grid[i][j] == '0' || visited[i][j]) continue ;
                
                q.push(make_pair(i,j)) ;
                
                ans += 1 ;
                
                while(! q.empty())
                {
                    auto pos = q.front() ; q.pop() ;
                    
                    int x = pos.first, y = pos.second ;
                    
                    visited[x][y] = true ;
                    
                    for(int k = 0 ; k < directions.size() ; k++)
                    {
                        x = x + directions[k][0] ; y = y + directions[k][1] ;
                        
                        if(isValid(x, y, m, n) && grid[x][y] == '1')
                            q.push(make_pair(x, y)) ;
                        
                    }
                }
            }
        }
        
        return ans ;
    }
    
    int numIslands(vector<vector<char>>& grid) {
        int ans = 0 ;
        
        if(grid.empty() || grid[0].empty()) return 0 ;
        
        int m = grid.size() ;
        int n = grid[0].size() ;
        int res = 0 ;
        
        vector<vector<bool>> visited(m, vector<bool>(n, false)) ;
        
        for(int i = 0 ; i < m ; ++i)
        {
            for(int j = 0 ; j < n ; ++j)
            {
                if(grid[i][j] == '1' && ! visited[i][j])
                {
                    islandDfs(grid, visited, i, j) ;
                    ++res ;
                }
            }
        }
        
        return res ;
    }
    
    void islandDfs(vector<vector<char>> &grid, vector<vector<bool>>& visited, int x, int y)
    {
        if(x < 0 || x >= grid.size()) return ;
        
        if(y < 0 || y >= grid[0].size()) return ;
        
        if(grid[x][y] != '1' || visited[x][y])  return ;
        
        visited[x][y] = true ;
        
        islandDfs(grid, visited, x - 1, y) ;
        
        islandDfs(grid, visited, x + 1, y) ;
        
        islandDfs(grid, visited, x , y - 1) ;
        
        islandDfs(grid, visited, x , y + 1) ;
        
        
    }
};
