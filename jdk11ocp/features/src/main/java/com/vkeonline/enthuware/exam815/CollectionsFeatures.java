package com.vkeonline.enthuware.exam815;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class CollectionsFeatures {
    /**
     * Note: binarySearch returns -1 if nothing is found
     */
    public void checkBinarySearch() {
        String[] sa = {"a", "aa", "aaa", "aaaa"};
        Arrays.sort(sa);
        String search = "";
        System.out.println(Arrays.binarySearch(sa, search));
        System.out.println(Arrays.binarySearch(sa, "A"));
    }


}

