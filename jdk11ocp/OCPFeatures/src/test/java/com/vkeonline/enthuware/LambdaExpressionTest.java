package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExpressionTest {
    static LambdaExpression le = new LambdaExpression() ;

    @Test
    void checkLambdaExpScope() {
        le.checkLambdaExpScope();
    }
}