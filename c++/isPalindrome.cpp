
 
// leetcode.com 9. Palindrome Number

class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0)  return false ;

        int div1 = 1, div2 = 1;
        int k = 0 ;

        // to handle overflow
        while(x / div1 >= 10)
        {
            div1 = div1 * 10 ;
            k = k + 1 ;
        }

        for (int i = 0 ; i < k ; i++) {

            div2 = div2 * 10 ;
            int l = x / div1 % 10 ;
            int r = (x % div2) / (div2 / 10) ;
            if(l != r) return false ;
            div1 = div1 / 10 ;

        }

        return true ;
    }

};