
// leetcode.com  434. Number of Segments in a String

class Solution {
public:
    int countSegments(string s) {
        int res = 0;
        int n = s.size() ;

        for(int i = 0 ; i < n ; i++)
        {
            if(s[i] == ' ') continue ;
            res++ ;

            while(i < n && s[i] != ' ') i++ ;
        }    

        return res ;
    }
};