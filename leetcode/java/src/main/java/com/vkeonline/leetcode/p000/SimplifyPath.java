package com.vkeonline.leetcode.p000;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Leetcode [M]: 71. Simplify Path
 * @author csgear
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> queue = new LinkedList<>() ;
        for(String s: path.split("/")) {
            if("..".equals(s)) {
                queue.poll() ;
            }
            else if (!"".equals(s) && ! ".".equals(s)) {
                queue.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();

        if(queue.size() == 0) {
            return "/";
        }

        while(queue.size() != 0) {
            sb.append("/").append(queue.pollLast());
        }
        return sb.toString();
    }
}
