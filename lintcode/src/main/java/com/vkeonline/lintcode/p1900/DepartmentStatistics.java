package com.vkeonline.lintcode.p1900;

import java.util.*;

/**
 * LintCode: 1903. Department Statistics
 * @author csgear
 */
public class DepartmentStatistics {

    public List<String> departmentStatistics(List<String> employees, List<String> friendships) {
        Map<String, Set<Integer>> departments = new HashMap<>();
        Map<Integer, String> people = new HashMap<>();
        Map<String, Set<Integer>> friends = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String str : employees) {
            String[] strs = str.split(",");
            String department = strs[2].trim();
            int id = Integer.parseInt(strs[0]);
            if (!departments.containsKey(department)) {
                departments.put(department, new HashSet<>());
            }
            departments.get(department).add(id);
            people.put(id, department);
        }

        for (String connection : friendships) {
            String[] strs = connection.split(",");
            int id1 = Integer.parseInt(strs[0].trim());
            int id2 = Integer.parseInt(strs[1].trim());
            String department1 = people.get(id1);
            String department2 = people.get(id2);
            if (!department1.equals(department2)) {
                if (!friends.containsKey(department1)) {
                    friends.put(department1, new HashSet<>());
                }
                if (!friends.containsKey(department2)) {
                    friends.put(department2, new HashSet<>());
                }
                friends.get(department1).add(id1);
                friends.get(department2).add(id2);
            }
        }
        for (String depart : departments.keySet()) {
            String str = "";
            if (friends.containsKey(depart)) {
                str = depart + ": " + friends.get(depart).size() + " of " + departments.get(depart).size();
            } else {
                str = depart + ": " + "0 of " + departments.get(depart).size();
            }
            result.add(str);
        }
        return result;
    }
}
