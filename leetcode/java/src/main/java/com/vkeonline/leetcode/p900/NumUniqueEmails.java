package com.vkeonline.leetcode.p900;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode [E]: 929. Unique Email Addresses
 *
 * @author csgear
 */
public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
        for (String email : emails) {
            int atPosition = email.indexOf('@');
            String name = email.substring(0, atPosition);
            String domain = email.substring(atPosition + 1);
            name = name.replaceAll("[.]", "");
            int plusPosition = name.indexOf('+');
            if (plusPosition != -1) {
                name = name.substring(0, plusPosition);
            }
            result.add(name + '@' + domain);
        }

        return result.size();
    }
}
