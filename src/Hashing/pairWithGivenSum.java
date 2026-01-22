/*
 * This class checks if a pair with
 * given sum exists using HashMap.
 */

import java.util.HashMap;

class pairWithGivenSum {

    static boolean hasPair(int[] arr, int sum) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Traverse array
        for (int value : arr) {
            if (map.containsKey(sum - value)) {
                return true;
            }
            map.put(value, true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 1, 6 };
        System.out.println(hasPair(arr, 10));
    }
}
