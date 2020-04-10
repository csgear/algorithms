
// leetcode.com 215. Kth Largest Element in an Array

class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        vector<int>  nums1, nums2 ;
        
        int pivot = nums[0] ;
        
        for(auto& num: nums)
        {
            if(num > pivot)  nums1.push_back(num) ;
            
            if(num < pivot)  nums2.push_back(num) ;
            
            if(k <= nums1.size())  return findKthLargest(nums1, k) ;
            
            if(k > nums.size() - nums2.size()) return findKthLargest(nums2, nums.size() - nums2.size()) ;
        }
        
        return pivot ;
    }
};