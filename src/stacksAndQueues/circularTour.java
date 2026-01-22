/*
 * This class solves the Circular Tour problem.
 * It finds the starting petrol pump index.
 */

class circularTour {

    static int findStart(int[] petrol, int[] distance) {

        int start = 0, surplus = 0, deficit = 0;

        // Traverse all petrol pumps
        for (int i = 0; i < petrol.length; i++) {
            surplus += petrol[i] - distance[i];

            // If surplus becomes negative
            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = { 4, 6, 7, 4 };
        int[] distance = { 6, 5, 3, 5 };

        System.out.println(findStart(petrol, distance));
    }
}
