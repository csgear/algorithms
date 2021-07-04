package com.vkeonline.leetcode.interviews;

import com.vkeonline.leetcode.p900.NumUniqueEmails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumUniqueEmailsTest {

    @Test
    void numUniqueEmails() {
        NumUniqueEmails numUniqueEmails = new NumUniqueEmails();
        String[] emails;
        int expected;
        emails = new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        expected = 3;
        assertEquals(expected, numUniqueEmails.numUniqueEmails(emails));

        emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        expected = 2;
        assertEquals(expected, numUniqueEmails.numUniqueEmails(emails));
    }
}