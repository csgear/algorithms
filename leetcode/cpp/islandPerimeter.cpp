
// leetcode.com 463. Island Perimeter

class Solution {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        if(grid.empty() || grid[0].empty()) return 0 ;
        
        int ans = 0 ;
        
        int m = grid.size(), n = grid[0].size() ;
        
        for(int x = 0 ; x < m ; ++x)
        {
            for(int y = 0 ; y < n ; ++y)
            {
                if(grid[x][y] == 1) 
                {
                    ans += 4 ;
                
                    if(x > 0 && grid[x-1][y] == 1)  ans -= 2 ;
                
                    if(y > 0 && grid[x][y-1] == 1)  ans -= 2 ;
                }
            }
        }
        
        return ans ;
    }
};