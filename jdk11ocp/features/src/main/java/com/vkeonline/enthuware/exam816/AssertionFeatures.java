package com.vkeonline.enthuware.exam816;

import java.util.ArrayList;
import java.util.List;

public class AssertionFeatures {

    // Note:
    // 1) As a rule, assertion should not be used to assert the validity of the input
    // parameter of a public method, use `throw new RuntimeException`
    // 2) assert take a boolean value and throw AssertionError(), the second operand can be null
    // 3) assert <boolean expression> or assert<boolean expression>: <any expression but not void>
    // 4)
    public void checkAssertion() {

    }

    public void assertTest(List v) {
        assert v.size() == 10 : v;
        assert v != null : v == null;
        assert v != null : v = new ArrayList();

    }
}
