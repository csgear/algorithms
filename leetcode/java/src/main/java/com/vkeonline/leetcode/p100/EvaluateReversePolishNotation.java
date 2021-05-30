package com.vkeonline.leetcode.p100;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

/**
 * Leetcode [M]: 150. Evaluate Reverse Polish Notation
 * @author csgear
 */
public class EvaluateReversePolishNotation {
    private static final Map<String, BiFunction<Integer, Integer, Integer>>
            operations = new HashMap<>() ;
    static {
        operations.put("+", (a, b) -> a + b) ;
        operations.put("-", (a,b) -> a - b) ;
        operations.put("/", (a,b) -> a / b) ;
        operations.put("*", (a,b) -> a * b) ;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!operations.containsKey(token)) {
                stack.push(Integer.valueOf(token));
                continue;
            }

            int number2 = stack.pop() ;
            int number1 = stack.pop() ;
            BiFunction<Integer, Integer, Integer> operation = operations.get(token) ;
            int result = operation.apply(number1, number2) ;
            stack.push(result) ;
        }

        return stack.pop() ;
    }
}
