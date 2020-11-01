package com.vkeonline.leetcode.year2020.june;

import java.util.HashMap;
import java.util.Map;

/**
 * @author csgear
 */
public class MakingFileNamesUnique {
    public String[] getFolderNames(String[] names) {

        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i < names.length; i++){
            names[i] = getName(map, names[i]);
        }
        return names;
    }

    private String getName(Map<String, Integer> map, String name){
        if (map.containsKey(name)){
            int n = map.get(name) + 1;

            while (map.containsKey(name + "(" + n + ")")){
                n++;
            }
            map.put(name, n);
            name = getName(map, name + "(" + n + ")");

        } else {
            map.put(name, 0);
        }
        return name;
    }
}
