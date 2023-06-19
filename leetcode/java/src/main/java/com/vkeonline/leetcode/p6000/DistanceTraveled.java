

package com.vkeonline.leetcode.p6000;

/**
 * Leetcode [E]: 6901. 总行驶距离
 * @author xiaojun.yang
 */
public class DistanceTraveled {
    public int  distanceTraveled(int mainTank, int additionalTank) {
        int ans = 0 ;
        while(mainTank >= 5) {
            int t = mainTank / 5 ;
            ans += t * 50 ;
            mainTank %= 5 ;
            t = Math.min(t, additionalTank) ;
            additionalTank -= t ;
            mainTank += t ;
        }
        return ans + mainTank * 10 ;
    }
}
