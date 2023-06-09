

package com.vkeonline.microsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leetcode [H]: 面试题 17.26. 稀疏相似度
 * @author csgear
 */
public class ComputeSimilarities {
    public List<String> computeSimilarities(int[][] docs) {
        List<String> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[][] intersection = new int[docs.length][docs.length];

        for (int i = 0; i < docs.length; i++) {
            for (int j = 0; j < docs[i].length; j++) {
                List<Integer> list = map.get(docs[i][j]);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(docs[i][j], list);
                } else {
                    for (Integer k : list) {
                        intersection[i][k]++;
                    }
                }
                list.add(i);
            }

            for (int k = 0; k < docs.length; k++) {
                if (intersection[i][k] > 0) {
                    ans.add(k + "," + i + ": " + String.format("%.4f", (double) intersection[i][k] / (docs[i].length + docs[k].length - intersection[i][k])));
                }
            }
        }
        return ans;

    }

    public List<String> computeSimilaritiesBruteForce(int[][] docs) {
        List<String> result = new ArrayList<>() ;
        for(int[] doc: docs) {
            Arrays.sort(doc) ;
        }
        for (int i = 0; i < docs.length; i++) {
            for (int j = i + 1; j < docs.length; j++) {
                int ans = intersection(docs[i], docs[j]) ;
                if(ans > 0) {
                    result.add(String.format(
                            "%s,%s: %.4f", i, j,
                            ans * 1.0 / (docs[i].length + docs[j].length - ans)
                    ));
                }
            }
        }

        return result ;
    }

    public int intersection(int[] doc1, int[] doc2) {
        int m = doc1.length ;
        int n = doc2.length ;
        int ans = 0 ;
        int i = 0, j = 0 ;
        while(i < m && j < n) {
            if(doc1[i] == doc2[j]) {
                i++ ;
                j++ ;
                ans++ ;
            } else if(doc1[i] < doc2[j]) {
                i++ ;
            }
            else {
                j++ ;
            }
        }
        return ans ;
    }
}
