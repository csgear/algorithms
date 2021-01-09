package com.vkeonline.leetcode.year2020.oct;

import org.junit.jupiter.api.Test;

class HouseRobber2Test {

    @Test
    void rob() {
        HouseRobber2 houseRobber2 = new HouseRobber2();
        int[] nums = {2, 3, 2};
        System.out.println(houseRobber2.rob(nums));
    }
}