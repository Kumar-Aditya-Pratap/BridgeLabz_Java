package Methods.Level3;

class NumberCheckerArrayOps {

    static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++)
            r[i] = d[d.length - 1 - i];
        return r;
    }

    static boolean isPalindrome(int[] d) {
        int[] r = reverse(d);
        for (int i = 0; i < d.length; i++)
            if (d[i] != r[i])
                return false;
        return true;
    }
}
