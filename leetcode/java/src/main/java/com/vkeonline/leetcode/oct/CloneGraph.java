package com.vkeonline.leetcode.oct;

import com.vkeonline.leetcode.common.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
    private static HashMap<GraphNode, GraphNode> map = new HashMap<>() ;

    public GraphNode cloneGraph(GraphNode node) {
        if(node == null) {
            return null ;
        }

        if(map.containsKey(node)) {
            return map.get(node) ;
        }

        GraphNode newNode = new GraphNode() ;
        newNode.val = node.val ;

        map.put(node, newNode) ;
        List<GraphNode> neighbors = new ArrayList<>() ;

        for(GraphNode n: node.neighbors) {
            neighbors.add(cloneGraph(n)) ;
        }
        newNode.neighbors = neighbors ;
        return map.get(node) ;
    }
}
