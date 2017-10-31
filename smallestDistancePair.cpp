
# leetcode.com 719. Find K-th Smallest Pair Distance

class Solution {
public:
	int smallestDistancePair(vector<int>& nums, int k) {
		sort(nums.begin(), nums.end()) ;
		const int n = nums.size() ;
		int l = 0 ;
		int r = nums.back() - nums.front() ;

		while(l <= r)
		{
			int count = 0 ;
			int j = 0 ;

			int m = l + (r - l) / 2 ;

			for(int i = 0 ; i < n ; ++i)
			{
				while(j < n && nums[j] - nums[i] <= m) ++j ;

				count += j - i - 1 ;
			}

			count >= k ? r = m - 1 : l = m + 1 ;
		}

		return l ;

	}

 
/*    int smallestDistancePair(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end()) ;
        
        auto N = nums.back() ;
        
        vector<int> counts(N+1, 0) ;
        
        const int n = nums.size() ;
        
        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = i + 1 ; j < n ; ++j)
                counts[nums[j] - nums[i]]++ ;
        }
        
        for(int i = 0 ; i < N ; ++i)
        {
            k -= counts[i] ;
            
            if(k <= 0) return i ;
        }
        
        return 0 ;
    }*/
};