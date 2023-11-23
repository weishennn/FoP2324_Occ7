package lab5;

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random x = new Random();
        Scanner sc = new Scanner(System.in);
        int[] randomInt = new int[20];

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = x.nextInt(101);
            System.out.print(randomInt[i]);
            if (i != (randomInt.length - 1))
                System.out.print(", ");
        }

        System.out.println();
        System.out.println("Array in descending order ");
        int max;
        for (int i = 0; i < randomInt.length; i++) {
            for (int j = i + 1; j < randomInt.length; j++) {
                if (randomInt[i] < randomInt[j]) {
                    max = randomInt[i];
                    randomInt[i] = randomInt[j];
                    randomInt[j] = max;
                }
            }
            System.out.print(randomInt[i]);
            if (i != (randomInt.length - 1))
                System.out.print(", ");
        }

        System.out.println();
        System.out.print("Enter a number to search: ");
        int number = sc.nextInt();
        for (int i = 0; i < randomInt.length; i++) {
            if (number == randomInt[i]) {
                System.out.println(number + " found");
                System.out.println("Linear Search - " + i + " loop(s) ");
                break;
            }
        }

        int start = 0;
        int end = randomInt.length - 1;
        int middle;
        for (int i = 1; start <= end; i++) {
            middle = (start + end) / 2;
            if (number == randomInt[middle]) {
                System.out.println(number + " found");
                System.out.println("Binary Search - " + i + " loop(s) ");
                break;
            } else if (number > randomInt[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
    }
}