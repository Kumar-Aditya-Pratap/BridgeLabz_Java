package ProgrammingElements.Level2;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " +
                areaInch + " and sq cm is " + areaCm);
    }
}
