package lab2;

import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Number: " + num);

        // Use a, b, ... to denote digits of the number abcde.
        int a = num / 10000; // 0
        num %= 10000; // 9876
        int b = num / 1000; // 9
        num %= 1000; // 876
        int c = num / 100; // 8
        num %= 100; // 76
        int d = num / 10; // 7
        int e = num % 10; // 6
        System.out.println("Sum of digits in the number: " + (a + b + c + d + e));

    }
}
