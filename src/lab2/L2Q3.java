package lab2;

import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
        Random x = new Random();
        int max = 51;
        int min = 10;
        int num1 = x.nextInt(max-min) + min;
        // x.nextInt(5) -> range from 0 - 4.
        // so if want lower bound > 0, just add behind.
        // eg. x.nextInt(5) + 3 -> range from 3 - 7.
        int num2 = x.nextInt(max-min) + min;
        int num3 = x.nextInt(max-min) + min;
        int sum = num1+num2+num3;
        double average = sum/3.0;
        System.out.printf("The three numbers: %d, %d, %d\n", num1, num2, num3);
        System.out.printf("The sum of the numbers: %d\n", sum);
        System.out.printf("The average: %.2f\n", average);


    }
}
