
package com.vkeonline.leetcode.p2000;

/**
 * Leetcode [M]: 2091. Removing Minimum and Maximum From Array
 * @author csgear
 */
public class RemoveMinMax {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minI = -1;
        int max = Integer.MIN_VALUE;
        int maxI = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                minI = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxI = i;
            }
        }
        int minDel = Integer.MAX_VALUE;
        if(minI > maxI){
            minDel = Math.min(minDel, (maxI + 1) + (nums.length-minI));
            minDel = Math.min(minDel, (minI + 1));
            minDel = Math.min(minDel, (nums.length-maxI));
        }else {
            minDel = Math.min(minDel, (minI + 1) + (nums.length-maxI));
            minDel = Math.min(minDel, (maxI + 1));
            minDel = Math.min(minDel, (nums.length-minI));
        }
        return minDel;
    }
}
