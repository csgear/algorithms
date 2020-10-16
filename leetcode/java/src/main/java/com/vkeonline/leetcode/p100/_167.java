package com.vkeonline.leetcode.p100;

public class _167 {

    static class TwoSum167 {
        // Can be done in linear time
//    public int[] twoSum(int[] numbers, int target) {
//        int index1, index2 ;
//        for(int i = 0 ; i < numbers.length - 1 ; i++) {
//            index1 = i ;
//            index2 = Arrays.binarySearch(numbers, i+1, numbers.length, target - numbers[i]) ;
//            if(index1 < index2) {
//               return new int[] {index1, index2} ;
//            }
//        }
//        return new int[] {-1, -1} ;
//    }

        // linear time algorithm
        public int[] twoSum(int[] numbers, int target) {
            int left = 0, right = numbers.length - 1;

            while (left < right) {
                int sum = numbers[left] + numbers[right];
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return new int[]{left + 1, right + 1};
                }
            }

            return null;
        }
    }

}
