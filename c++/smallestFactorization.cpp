
// leetcode.com  625 Minimum Factorization

class Solution
{
  public:
    int smallestFactorization(int a)
    {

        string s = "";

        //  if(a == 1) return 1 ;

        for (int i = 9; i >= 2; --i)
        {
            while (a % i == 0)
            {
                s = to_string(i) + s;
                a = a / i;
            }
        }

        if (a > 1)
            return 0;

        long long num = strtoll(s);

        return num > INT_MAX ? 0 : num;
    }
}