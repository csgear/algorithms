
//leetcode.com  405. Convert a Number to Hexadecimal

class Solution
{
  public:
    string toHex(int num)
    {
        string s = "" ;
        
        for (int i = 0; num && i < 8; ++i) {
        {
            int n = num & 0xf;

            if (n >= 10)
                s = char(n - 10 + 'a') + s;

            else
                s = char(n + '0') + s;

            num = num >> 4;
        }

        return res.empty() ? "0" : res;
    }
};