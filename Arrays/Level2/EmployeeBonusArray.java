package Arrays.Level2;

import java.util.Scanner;

class EmployeeBonusArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 10;
        double[] salary = new double[size];
        double[] years = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < size; i++) {
            salary[i] = input.nextDouble();
            years[i] = input.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
        }

        for (int i = 0; i < size; i++) {
            bonus[i] = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
