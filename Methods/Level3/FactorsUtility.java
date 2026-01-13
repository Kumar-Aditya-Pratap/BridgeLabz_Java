package Methods.Level3;

class FactorsUtility {

    static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        int[] f = new int[c];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                f[idx++] = i;
        return f;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;
        return sum == n;
    }
}
