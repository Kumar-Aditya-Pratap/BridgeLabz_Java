package Methods.Level3;

class FootballTeamStats {

    static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++)
            heights[i] = (int) (Math.random() * 101) + 150;
        return heights;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int v : arr)
            s += v;
        return s;
    }

    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int shortest(int[] arr) {
        int min = arr[0];
        for (int v : arr)
            min = Math.min(min, v);
        return min;
    }

    static int tallest(int[] arr) {
        int max = arr[0];
        for (int v : arr)
            max = Math.max(max, v);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Mean: " + mean(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
    }
}
