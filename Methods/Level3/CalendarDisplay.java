package Methods.Level3;

class CalendarDisplay {

    static boolean isLeap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }

    static int firstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }
}
