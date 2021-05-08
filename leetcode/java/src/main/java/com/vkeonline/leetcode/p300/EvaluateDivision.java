package com.vkeonline.leetcode.p300;

import java.util.HashMap;
import java.util.List;

public class EvaluateDivision {
    class UnionFind {
        HashMap<String, String> parent = new HashMap<>();
        HashMap<String, Double> map = new HashMap<>();

        public String find(String i) {
            while (!i.equals(parent.get(i)))
                i = parent.get(i);

            return parent.get(i);
        }

        public void union(String i, String j, double val) {
            String rooti = find(i);
            String rootj = find(j);

            if (!rooti.equals(rootj)) {
                if (parent.containsKey(j) && !parent.get(j).equals(j)) {
                    parent.put(i, j);
                    map.put(i, 1.0 / val);
                } else {
                    parent.put(j, i);
                    map.put(j, val);
                }
            }
        }

        public double getVal(String i) {
            double result = 1.0;
            while (!i.equals(parent.get(i))) {
                result = map.get(i) * result;
                i = parent.get(i);
            }
            return 1.0 / result;
        }
    }

    public double[] calcEquation(List<List<String>> equations,
                                 double[] values,
                                 List<List<String>> queries) {
        int row = equations.size();
        int qrow = queries.size();

        UnionFind uf = new UnionFind();
        double[] result = new double[qrow];

        for (List<String> equation : equations) {
            uf.parent.put(equation.get(0), equation.get(0));
            uf.parent.put(equation.get(1), equation.get(1));
            uf.map.put(equation.get(0), 1.0);
            uf.map.put(equation.get(1), 1.0);
        }

        for (int i = 0; i < row; i++) {
            String x = equations.get(i).get(0);
            String y = equations.get(i).get(1);
            uf.union(x, y, values[i]);
        }

        for (int i = 0; i < qrow; i++) {
            String x = queries.get(i).get(0);
            String y = queries.get(i).get(1);
            if (uf.map.get(x) == null || uf.map.get(y) == null || uf.find(x) != uf.find(y)) {
                result[i] = -1.0;
            } else {
                result[i] = uf.getVal(x) / uf.getVal(y);
            }
        }

        return result;
    }
}
