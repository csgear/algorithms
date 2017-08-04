
//leetcode.com 539. Minimum Time Difference

class Solution
{
  public:
    int findMinDifference(vector<string> &timePoints)
    {
        int n = timePoints.size();

        vector<int> tms;

        for (auto &s : timePoints)
        {
            int hours = stoi(s.substr(0, 2));
            int mins = stoi(s.substr(3));

            tms.push_back(hours * 60 + mins);
        }

        sort(tms.begin(), tms.end());

        int res = INT_MAX;

        for (int i = 1; i < tms.size(); i++)
        {
            res = min(res, tms[i] - tms[i - 1]);
        }

        return min(res, 1440 + tms[0] - tms[n - 1]);
    }
};