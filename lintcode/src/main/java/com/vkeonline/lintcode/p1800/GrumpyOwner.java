package com.vkeonline.lintcode.p1800;

/**
 * Lint code: 1849. Grumpy Bookstore Owner
 *
 * @author csgear
 */
public class GrumpyOwner {
    /**
     * @param customers: the number of customers
     * @param grumpy:    the owner's temper every day
     * @param X:         X days
     * @return calc the max satisfied customers
     */
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int n = customers.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += customers[i] * (1 - grumpy[i]);
        }

        int cur = 0 ;
        for (int i = 0; i < X; i++) {
            cur += customers[i] * grumpy[i];
        }

        int maxx = cur;
        for (int i = X; i < n; i++) {
            cur = cur + customers[i] * grumpy[i] - customers[i - X] * grumpy[i - X];
            maxx = Math.max(maxx, cur);
        }

        return sum + maxx;
    }
}
