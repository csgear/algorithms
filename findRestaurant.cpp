//
//  leetcode.com: 599. Minimum Index Sum of Two Lists

#include <vector>
#include <map>
#include <string>

using namespace std;

class Solution
{
  public:
    vector<string> findRestaurant(vector<string> &list1, vector<string> &list2)
    {
        map<string, int> m1, m2;
        vector<string> result;

        int minsum = list1.size() + list2.size();

        int cursum = 0;

        for (int i = 0; i < list1.size(); i++)
            m1[list1[i]] = i;

        for (int i = 0; i < list2.size(); i++)
        {
            if (m1.find(list2[i]) == m1.end())
                continue;

            cursum = m1[list2[i]] + i;

            if (cursum < minsum)
            {
                minsum = cursum;
                result = {list2[i]};
            }
            else if (cursum == minsum)
            {
                result.push_back(list2[i]);
            }
        }

        return result;
    }
};
