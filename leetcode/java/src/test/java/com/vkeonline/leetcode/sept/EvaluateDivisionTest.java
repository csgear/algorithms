package com.vkeonline.leetcode.sept;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class EvaluateDivisionTest {

    @Test
    void calcEquation() {
        EvaluateDivision evaluateDivision = new EvaluateDivision();

        String[][] equations = {{"a", "b"}, {"b", "c"}, {"bc", "cd"}};

        double[] values = {1.5, 2.5, 5.0};

        String[][] queries = {{"a", "c"}, {"c", "b"}, {"bc", "cd"}, {"cd", "bc"}};

        List<List<String>> equationList = new ArrayList<>();

        for (String[] equation : equations) {
            equationList.add(Arrays.asList(equation));
        }

        List<List<String>> queryList = new ArrayList<>();

        for (String[] query : queries) {
            queryList.add(Arrays.asList(query));
        }

        double[] result = evaluateDivision.calcEquation(equationList, values, queryList) ;

        Arrays.stream(result).forEach(System.out::println);


    }
}