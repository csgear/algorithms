package com.vkeonline.lintcode.p1000;

/**
 * Lintcode 1017. Similar RGB Color
 *
 * @author csgear
 */
public class SimilarRGBColor {
    public String similarRGB(String color) {
        StringBuilder res = new StringBuilder("#");
        for (int i = 1; i < color.length(); i += 2) {
            res.append(process(color.substring(i, i + 2)));
        }
        return res.toString();
    }

    private String process(String hex) {
        int[] nums = new int[]{0x0, 0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77, 0x88,
                0x99, 0xAA, 0xBB, 0xCC, 0xDD, 0xEE, 0xFF};
        int num = Integer.parseInt(hex, 16);
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(num - nums[i]) < Math.abs(num - result)) {
                result = nums[i];
            }
        }

        if (result != 0x0) {
            return Integer.toString(result, 16);
        } else {
            return "00";
        }
    }
}
