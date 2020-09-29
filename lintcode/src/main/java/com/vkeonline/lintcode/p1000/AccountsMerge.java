package com.vkeonline.lintcode.p1000;

import java.util.*;

/**
 * 1070. Accounts Merge
 * @author csgear
 */
public class AccountsMerge {

    class UnionFindSet {
        int[] parents, rank ;
        int size ;

        public UnionFindSet(int size) {
            parents = new int[size] ;
            rank = new int[size] ;
            this.size = size ;
            for (int i = 0; i < size; i++) {
                parents[i] = i ;
            }
        }

        public boolean union(int u, int v) {
            int su = find(u) ;
            int sv = find(v) ;

            if(su == sv)  {
                return false ;
            }

            if(rank[su] > rank[sv]) {
                parents[sv] = su ;
            }
            else if(rank[sv] > rank[su]) {
                parents[su] = sv ;
            }
            else {
                parents[sv] = su ;
                rank[su]++ ;
            }

            size-- ;
            return true ;

        }

        public int find(int u) {
            while(parents[u] != u) {
                parents[u] = parents[parents[u]] ;
                u = parents[u] ;
            }
            return u ;
        }

    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> ret = new ArrayList<>();
        if (accounts.size() == 0) {
            return ret;
        }

        UnionFindSet uf = new UnionFindSet(accounts.size()) ;

        Map<String, Integer> emailsToId = new HashMap<>();

        for (int id = 0; id < accounts.size(); id++) {
            List<String> cnts = accounts.get(id) ;
            for (int i = 1; i < cnts.size(); i++) {
                String email = cnts.get(i) ;
                emailsToId.putIfAbsent(email, id) ;
                uf.union(emailsToId.get(email), id) ;
            }
        }

        Map<Integer, List<String>> indx = new HashMap<>();

        for(String email: emailsToId.keySet()) {
            int root = uf.find(emailsToId.get(email)) ;
            indx.putIfAbsent(root, new LinkedList<>()) ;
            indx.get(root).add(email) ;
        }

        for(int id: indx.keySet()) {
            List<String> ends = new ArrayList<>();
            String name = accounts.get(id).get(0) ;
            List<String> emails = indx.get(id) ;
            Collections.sort(emails) ;
            ends.add(name) ;
            ends.addAll(emails) ;
            ret.add(ends) ;
        }
        return ret ;
    }

}
