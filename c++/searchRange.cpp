
// leetcode.com  34. Search for a Range

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> res(2, -1) ;

        int left = 0, right = nums.size() - 1 ;

        while(left < right)
        {
            int mid = left + (right - left) / 2 ;

            if(nums[mid] < target) left = mid + 1 ;

            else right = mid ;
        }

        if(mid[left] != target ) return res ;

        res[0] = right ;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) left = mid + 1;
            else right= mid;
        }
        res[1] = left - 1;

        return res ;

    }
};