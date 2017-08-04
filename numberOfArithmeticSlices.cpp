
// leetcode.com : 413. Arithmetic Slices

class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& A) {
        int res = 0, cur = 0;
        
        // 计算等差数列的和
        for (int i = 2; i < A.size(); ++i) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                cur += 1;
                res += cur;
            } else {
                cur = 0;
            }
        }
        
        return res;    
    }
};