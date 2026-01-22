/*
 * This class solves the Two Sum problem
 * using HashMap for efficient lookup.
 */

import java.util.HashMap;

class twoSum {

    static void findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array
        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                System.out.println("Pair found: " + required + " & " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        findPair(arr, 9);
    }
}
