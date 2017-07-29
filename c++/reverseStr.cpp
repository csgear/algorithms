
// leetcode.com  541. Reverse String II

class Solution {
public:
    string reverseStr(string s, int k) {
        // reverse k elements in every 2k round, can be done in place
        for (int i = 0; i < s.size(); i += 2 * k) {
            reverse(s.begin() + i, min(s.begin() + i + k, s.end()));
        }
        return s;       
    }
};