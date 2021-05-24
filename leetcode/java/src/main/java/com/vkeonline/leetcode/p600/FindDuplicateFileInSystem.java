package com.vkeonline.leetcode.p600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leetcode [M]: 609. Find Duplicate File in System
 *
 * @author csgear
 */
public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] nameAndContent = values[i].split("\\(");
                nameAndContent[1].replace(")", "");
                List<String> list = map.getOrDefault(nameAndContent[1], new ArrayList<>());
                list.add(values[0] + "/" + nameAndContent[0]);
                map.put(nameAndContent[1], list);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1)
                res.add(map.get(key));
        }
        return res;
    }
}
