/*
 * This class finds subarrays with zero sum
 * using HashMap and prefix sum technique.
 */

import java.util.HashMap;

class zeroSumSubarrays {

    static void checkZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // Traverse array
        for (int value : arr) {
            sum += value;

            if (sum == 0 || map.containsKey(sum)) {
                System.out.println("Zero sum subarray exists");
                return;
            }

            map.put(sum, 1);
        }

        System.out.println("No zero sum subarray");
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        checkZeroSum(arr);
    }
}
