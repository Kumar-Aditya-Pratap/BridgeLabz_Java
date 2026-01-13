package Methods.Level3;

class NumberCheckerBasic {

    static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    static int[] getDigits(int n) {
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static boolean isDuck(int[] d) {
        for (int v : d)
            if (v == 0)
                return true;
        return false;
    }

    static boolean isArmstrong(int n, int[] d) {
        int sum = 0;
        for (int v : d)
            sum += Math.pow(v, d.length);
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);
        System.out.println(isDuck(d));
        System.out.println(isArmstrong(n, d));
    }
}
