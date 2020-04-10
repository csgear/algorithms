package com.vkeonline.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails929 {
    public static void main(String[] args) {
        String[] emails = {
                "testemail@leetcode.com",
                "testemail1@leetcode.com",
                "testemail+david@lee.tcode.com"
        };

        NumUniqueEmails929 numUniqueEmails929 = new NumUniqueEmails929() ;

        System.out.println(numUniqueEmails929.numUniqueEmails(emails)) ;
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> address = new HashSet<>();

        for (String email : emails) {
            int domainPos = email.indexOf('@');
            int plusPos = email.indexOf('+');

            String name;

            if (plusPos > 0) {
                name = email.substring(0, plusPos) ;
            } else {
                name = email.substring(0, domainPos);
            }

            name = name.replaceAll("\\.", "");
            String domain = email.substring(domainPos);

            address.add(name + domain);
        }

        return address.size();
    }
}
