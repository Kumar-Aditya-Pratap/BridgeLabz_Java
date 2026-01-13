package Methods.Level2;

class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;

        for (int v : arr) {
            sum += v;
            min = Math.min(min, v);
            max = Math.max(max, v);
        }

        return new double[] { (double) sum / arr.length, min, max };
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(nums);

        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }
}
