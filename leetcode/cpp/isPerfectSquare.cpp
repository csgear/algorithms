
// leetcode.com 367. Valid Perfect Square

class Solution
{
  public:
    bool isPerfectSquare(int num)
    {
        for (int i = 1; i <= num / i; ++i)
        {
            if (i * i == num)
                return true;
        }
        return false;
    }

    bool isPerfectSquareTLE(int num)
    {
        int left = 0, right = num;

        while (left <= right)
        {
            int middle = (left + right) / 2;

            if (middle * middle >= num)
                right = middle - 1;
            else
                left = middle + 1;
        }

        return left * left == num;
    }
};