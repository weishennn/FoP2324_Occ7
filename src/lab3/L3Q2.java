package lab3;

import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt(6);
        String word ="";
        switch (num) {
            case 0 -> word = "zero";
            case 1 -> word = "one";
            case 2 -> word = "two";
            case 3 -> word = "three";
            case 4 -> word = "four";
            case 5 -> word = "five";
        }
        System.out.println(num+" is " + word+".");

    }
}