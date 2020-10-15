package com.vkeonline.lintcode.p1700;

import java.util.HashMap;
import java.util.Map;

/**
 * LintCode: 1789. Distinguish Username
 * @author csgear
 */
public class DistinguishUsername {
    public String[] DistinguishUsername(String[] names) {
        // Write your code here
        if (names == null) return null;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            if (map.containsKey(names[i])) {
                int count = map.get(names[i]);
                map.put(names[i], count + 1);
                names[i] += String.valueOf(count);
            } else {
                map.put(names[i], 1);
            }
        }

        return names;

    }
}
