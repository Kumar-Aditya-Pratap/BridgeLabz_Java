package Methods.Level3;

class NumberCheckerSpecial {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static boolean isNeon(int n) {
        int sq = n * n, s = 0;
        while (sq > 0) {
            s += sq % 10;
            sq /= 10;
        }
        return s == n;
    }

    static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
