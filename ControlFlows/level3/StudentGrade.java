package ControlFlows.level3;

import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        input.close();
    }
}
