package Methods.Level3;

class StudentScorecard {

    static double[][] generateMarks(int n) {
        double[][] m = new double[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = (int) (Math.random() * 90) + 10;
        return m;
    }
}
