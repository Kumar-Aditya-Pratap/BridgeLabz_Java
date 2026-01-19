package Arrays.Level2;

import java.util.Scanner;

/**
 * The EmployeeBonusArray class processes payroll data for a fixed group of employees.
 * It calculates annual bonuses based on the years of service: 5% for more than 
 * 5 years and 2% otherwise. The program stores data in parallel arrays and 
 * calculates the total expenditure for bonuses and salaries.
 */
class EmployeeBonusArray {
    public static void main(String[] args) {
        // Initialize Scanner for data entry
        Scanner input = new Scanner(System.in);

        // Define a fixed size for the employee dataset
        int size = 10;
        
        // Parallel arrays to store salary, service years, bonus amount, and updated salary
        double[] salary = new double[size];
        double[] years = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        // Accumulator variables for financial totals
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Block 1: Input collection and data validation
        for (int i = 0; i < size; i++) {
            salary[i] = input.nextDouble();
            years[i] = input.nextDouble();

            // Ensure salary is positive and years of service are non-negative
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input");
                i--; // Decrement loop counter to re-attempt entry for this index
                continue;
            }
        }

        // Block 2: Bonus calculation and summation logic
        for (int i = 0; i < size; i++) {
            // Apply 5% bonus if years > 5, else apply 2% bonus
            bonus[i] = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            
            // Calculate the updated salary by adding the bonus
            newSalary[i] = salary[i] + bonus[i];

            // Update running totals for final reporting
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Block 3: Output the calculated financial summary
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close resource to prevent memory leaks
        input.close();
    }
}