/*
 * This class finds the longest consecutive
 * sequence in an unsorted array.
 */

import java.util.HashSet;

class longestConsecutiveSequence {

    static int findLongest(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Store all elements
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Check sequences
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        System.out.println(findLongest(arr));
    }
}
