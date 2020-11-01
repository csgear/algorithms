package com.vkeonline.leetcode.year2020.sept;

import java.util.*;

/**
 * @author csgear
 */
public class EvaluateDivision {
    private void addEdge(Map<String, Map<String, Double>> graph, String start, String end, double weight) {
        Map<String, Double> edges;

        if (graph.containsKey(start)) {
            edges = graph.get(start);
        } else {
            edges = new HashMap<>();
            graph.put(start, edges);
        }
        edges.put(end, weight);
    }

    private double query(Map<String, Map<String, Double>> graph, String start, String end) {
        if (graph.get(start) == null || graph.get(end) == null) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        Map<String, Double> value = new HashMap<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);
        value.put(start, 1d);

        String currentNode, nextNode;
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            for (Map.Entry<String, Double> edge : graph.get(currentNode).entrySet()) {
                nextNode = edge.getKey();
                value.put(nextNode, value.get(currentNode) * edge.getValue());
                if (nextNode.equals(end)) {
                    return value.get(end);
                } else if (!visited.contains(nextNode)) {
                    queue.add(nextNode);
                    visited.add(nextNode);
                }
            }
        }
        return -1;
    }

    public double[] calcEquation(List<List<String>> equations,
                                 double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            addEdge(graph, equations.get(i).get(0), equations.get(i).get(1), values[i]);
            addEdge(graph, equations.get(i).get(1), equations.get(i).get(0), 1.0 / values[i]);
        }

        double[] result = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            result[i] = query(graph, queries.get(i).get(0), queries.get(i).get(1));
        }

        return result;
    }
}
