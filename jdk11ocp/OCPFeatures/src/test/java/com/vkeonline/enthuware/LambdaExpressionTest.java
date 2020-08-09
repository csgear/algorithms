package com.vkeonline.enthuware;

import com.vkeonline.enthuware.exam815.LambdaExpression;
import org.junit.jupiter.api.Test;

class LambdaExpressionTest {
    static LambdaExpression le = new LambdaExpression() ;

    @Test
    void checkLambdaExpScope() {
        le.checkLambdaExpScope();
    }
}