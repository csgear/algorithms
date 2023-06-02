package com.vkeonline.leetcode.year2020.nov;

import com.vkeonline.leetcode.p800.FlipImage;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FlipImageTest {

    @Test
    void flipAndInvertImage() {
        int[][] images = {{1,1,0},{1,0,1},{0,0,0}} ;
        FlipImage flipImage = new FlipImage() ;
        int[][] result = flipImage.flipAndInvertImage(images) ;

        System.out.println(Arrays.deepToString(result));
    }
}