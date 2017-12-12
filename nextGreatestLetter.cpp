
// leetcode.com  744. Find Smallest Letter Greater Than Target

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std ;

class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        auto it = std::upper_bound(letters.begin(), letters.end(), target) ;  

        if (it == letters.end()) it = letters.begin() ;

        return *it ;  
    }
};

