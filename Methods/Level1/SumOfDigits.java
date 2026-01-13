package Methods.Level1;

class SumOfDigits {

    public int get4DigitRandomNumber() {
        return (int) (Math.random() * 9000) + 1000;
    }

    public int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int value : array)
            sum += value;
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();

        int number = obj.get4DigitRandomNumber();
        System.out.println("Random Number: " + number);

        int count = obj.countDigits(number);
        int[] digits = obj.getDigits(number, count);

        int sum = obj.sumArray(digits);
        System.out.println("Sum of Digits: " + sum);
    }
}
