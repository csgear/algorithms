package com.vkeonline.lintcode.p400;

import java.util.ArrayList;
import java.util.List;

/**
 * Lintcode: 426. Restore IP Addresses
 *
 * @author csgear
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        if (!isValid(s)) return new ArrayList();
        List<String> list = new ArrayList();
        traverse(s, 0, list, new ArrayList());
        return list;
    }

    boolean isValid(String s) {
        if (s == null || s.length() < 4 || s.length() > 12) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch > '9' || ch < '0') {
                return false;
            }
        }
        return true;
    }

    void traverse(String s, int index, List<String> list, List<Integer> current) {
        if (index == s.length()) {
            if (current.size() == 4) {
                String str = current.get(0) + "." + current.get(1) + "." + current.get(2) + "." + current.get(3);
                list.add(str);
            }
            return;
        }

        int num = 0;
        for (int i = index; i < index + 3 && i < s.length(); i++) {
            char ch = s.charAt(i);
            num = num * 10 + (ch - '0');

            if (num > 255) {
                break;
            }
            current.add(num);
            traverse(s, i + 1, list, current);
            current.remove(current.size() - 1);
            if (num == 0) {
                break;
            }
        }
    }
}
