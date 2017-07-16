

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double avg = 0 , result = INT_MIN ;
        
        double sum = 0 ;
        
        for(int i = 0 ; i < k ; i++)
        {
            sum = sum + nums[i] ;
        }
        
        avg = sum / k ;
        
        for(int i = k ; i < nums.size() ; i++)
        {
            sum = sum - nums[i - k] + nums[i] ;
            
            if(sum / k > avg)
                avg = sum / k ;
        }
        
        return avg ;
    }
};
