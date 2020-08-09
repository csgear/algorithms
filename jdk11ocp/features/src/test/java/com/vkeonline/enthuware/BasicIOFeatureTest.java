package com.vkeonline.enthuware;


import com.vkeonline.enthuware.exam816.BasicIoFeatures;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BasicIOFeatureTest {
    static BasicIoFeatures bio;

    @BeforeAll
    static void init() {
        bio = new BasicIoFeatures();
    }

    @Test
    void checkFileStream() throws Exception {
        bio.checkFileStream();
    }

    @Test
    void checkedBufferedReader() {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Number: ");
            String s = bfr.readLine();
            System.out.println("Your number is :" + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}