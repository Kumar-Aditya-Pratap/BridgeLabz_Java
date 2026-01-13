package Methods.Level3;

class EmployeeBonusZara {

    static double[][] generateData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10);
        }
        return data;
    }
}
