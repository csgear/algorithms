package com.vkeonline.enthuware;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class BasicIOFeatureTest {
    static BasicIOFeatures bio ;

    @BeforeAll
    static void init() {
        bio = new BasicIOFeatures() ;
    }

    @Test
    void checkFileStream() throws Exception{
        bio.checkFileStream();
    }

    @Test
    void checkedBufferedReader() {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Number: ");
            String s = bfr.readLine() ;
            System.out.println("Your number is :" + s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}