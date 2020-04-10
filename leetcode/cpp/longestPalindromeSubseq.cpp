
// leetcode.com 516. Longest Palindromic Subsequence

class Solution {
public:
    int longestPalindromeSubseq(string s) {
        int n = s.size() ;

        // v[i][j] =  Longest Palindromic Subsequence from s[i] to s[j] inclusive

        vector<vector<int> v(n, vector<int>(n, 0)) ;

        for(int i = n - 1 ; i >= 0  ; --i)
        {
            v[i][i] = 1 ;

            for(int j = i + 1 ; j < n ; ++j)
            {
                if(s[i] == s[j]) v[i][j] = v[i+1][j-1] + 2 ;
                
                else {
                    v[i][j] = max(v[i+1][j], v[i][j-1]) ;
                }
            }
        }

        return v[0][n-1] ;

    }
};