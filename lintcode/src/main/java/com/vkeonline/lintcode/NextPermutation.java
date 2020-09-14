package com.vkeonline.lintcode;

/**
 * LintCode: 52. Next Permutation
 * @author csgear
 */
public class NextPermutation {
        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int i, int j) {
            while (i < j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }

        public int[] nextPermutation(int[] nums) {
            int n = nums.length, k, l;

            k = n - 2;
            while (k >= 0) {
                if (nums[k] < nums[k + 1]) {
                    break;
                }
                k--;
            }

            if (k >= 0) {
                for (l = n - 1; l > k; l--) {
                    if (nums[l] > nums[k]) {
                        break;
                    }
                }
                swap(nums, k, l);
            }
            
            reverse(nums, k + 1, n - 1);

            return nums;
        }

}
