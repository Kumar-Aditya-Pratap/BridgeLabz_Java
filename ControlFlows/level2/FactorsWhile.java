package ControlFlows.level2;

import java.util.Scanner;

class FactorsWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 1;

        if (number > 0) {
            //checking whether the number is positive or not!
            while (counter < number) {
                if (number % counter == 0)
                    System.out.println(counter);
                counter++;
            }
        }

        input.close();
    }
}
