package com.vkeonline.leetcode.june;

/**
 * @author csgear
 */
public class RandomPickWeight {
    int[] probabilities;
    public RandomPickWeight(int[] w) {
        probabilities = new int[w.length];
        int sum = 0;
        for(int i = 0; i < w.length; i++){
            sum += w[i];
            probabilities[i] = sum;
        }
    }

    public int pickIndex() {
        double target = probabilities[probabilities.length - 1] * Math.random();
        int si = 0, ei = probabilities.length - 1;
        int res = -1;
        while(si <= ei){
            int mid = (si + (ei - si) / 2);
            if(target < probabilities[mid]){
                res = mid;
                ei = mid - 1;
            }
            else{
                si = mid + 1;
            }
        }
        return res;
    }
}
