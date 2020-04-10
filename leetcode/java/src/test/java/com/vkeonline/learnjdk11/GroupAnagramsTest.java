package com.vkeonline.learnjdk11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    public void judgeGroupAnagrams() {
        GroupAnagrams ga = new GroupAnagrams() ;
        List<List<String>> result = ga.groupAnagrams(new String[]{ "eat", "tea", "tan", "ate", "nat", "bat"}) ;

        // TODO: class casting won't work here, we shall pass new String[0] to toArray function
        for(List<String> innerLs : result) {
            String[] arr =  innerLs.toArray(new String[0]);
            System.out.println(Arrays.deepToString(arr));
        }
    }
}