package com.vkeonline.lintcode.p1800;

import java.util.*;

/**
 * Lintcode: 1883. Top K Frequently Mentioned Keywords
 * @author csgear
 */
public class TopKMentionedKeywords {
    public List<String> TopkKeywords(int K, String[] keywords, String[] reviews) {
        List<String>  result = new ArrayList<>();
        Set<String> keywordsSet = new HashSet<>(Arrays.asList(keywords));

        Map<String, Integer> map = new HashMap<>();

        for(String review: reviews) {
            String[] reviewWords = review.replaceAll("^a-zA-Z", " ").toLowerCase().split("\\s+") ;
            Set<String> reviewSet = new HashSet<>(Arrays.asList(reviewWords)) ;
            for(String word: reviewSet) {
                if(keywordsSet.contains(word)) {
                   int cnt = map.getOrDefault(word, 0) ;
                   cnt++ ;
                   map.put(word, cnt) ;
                }
            }
        }

        PriorityQueue<String> queue = new PriorityQueue<>(K, (o1, o2) -> {
            if(map.get(o1).equals(map.get(o2))) {
                return o2.compareTo(o1) ;
            }
            return map.get(o1) - map.get(o2) ;
        }) ;

        for (String word : map.keySet()) {
            queue.offer(word);
            if (queue.size() > K) {
                queue.poll();
            }
        }

        while (!queue.isEmpty()) {
            result.add(queue.poll()) ;
        }

        Collections.reverse(result) ;

        return result ;
    }
}
