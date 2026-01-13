package Methods.Level3;

class NumberCheckerAdvanced {

    static int sumDigits(int[] d) {
        int s = 0;
        for (int v : d)
            s += v;
        return s;
    }

    static int sumSquares(int[] d) {
        int s = 0;
        for (int v : d)
            s += Math.pow(v, 2);
        return s;
    }

    static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    static int[][] digitFrequency(int[] d) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++)
            freq[i][0] = i;
        for (int v : d)
            freq[v][1]++;
        return freq;
    }
}
