

package com.vkeonline.leetcode.p700;

import java.util.Arrays;

/**
 * Leetcode [M]: 787. Cheapest Flights Within K Stops
 * @author csgear
 */
public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if (src == dst) {
            return 0;
        }

        int[] previous = new int[n] ;
        int[] current = new int[n] ;
        Arrays.fill(previous, Integer.MAX_VALUE);
        Arrays.fill(current, Integer.MAX_VALUE);

        previous[src] = 0 ;

        // k + 1 because dst is an extra stop
        for (int i = 0; i < k + 1; i++) {
            current[src] = 0 ;
            for (int[] flight: flights) {
                int previous_flight = flight[0];
                int current_flight = flight[1];
                int cost = flight[2];

                if (previous[previous_flight] < Integer.MAX_VALUE) {
                    current[current_flight] = Math.min(
                            current[current_flight], previous[previous_flight] + cost
                    ) ;
                }
            }
            previous = current.clone();
        }

        return current[dst] == Integer.MAX_VALUE ? -1 : current[dst];
    }
}
