package com.vkeonline.enthuware;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AssertionFeatureTest {

    @BeforeAll
    static void turnoffAssertion() {
//        AssertionFeature.class.getClassLoader().setClassAssertionStatus(AssertionFeature.class.getName(), false);
    }
    @Test
    void checkAssertion() {
    }

    @Test
    void someAssertMethod() {
        boolean enabled = false ;
        assert enabled = true ;
        assert enabled ;

    }

    @Test
    void testAssertionFailure() {
        int counter = -4 ;
        assert counter >= 0: "Less than zero" ;
        for(int i = 0 ; i < counter ; i++) {}
    }


    // This junit 5 feature, passing an array to a test requires more efforts
    // So the following test case won't execute
    @ParameterizedTest
    @MethodSource("provideArgs")
    void testArgLength(String[] args) {
        assert args.length == 2: "Must given 2 arguments" ;
    }

    static private Stream<Arguments> provideArgs() {
        return Stream.of(Arguments.of("aa", "bb")) ;
    }


}