
// leetcode.com 520. Detect Capital

#include <string>
#include <algorithm>

using namespace std ;

class Solution {
public:
    bool detectCapitalUse(string word) {
        
        int cnt = count_if(word.begin(), word.end(), [](char c) { return c <= 'Z' ; }) ;
        
        return (cnt == 0 || (cnt == word.size() || (cnt == 1 && word[0] <= 'Z'))) ;
    }
};