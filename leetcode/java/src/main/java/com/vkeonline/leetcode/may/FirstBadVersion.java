package com.vkeonline.leetcode.may;

class VersionControl {
    boolean isBadVersion(int n) {
        return false ;
    }
}

public class FirstBadVersion extends VersionControl{
    public int firstBadVersion(int n) {
        int left = 1, right = n ;

        while(left + 1 < right) {
            int mid = left + (right - left) / 2 ;
            if(isBadVersion(mid)) {
                right = mid ;
            }
            else {
                left = mid ;
            }
        }

        if(isBadVersion(left)) {
            return left ;
        }

        return right ;
    }
}
