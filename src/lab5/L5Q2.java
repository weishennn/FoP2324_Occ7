package lab5;

import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random x = new Random();
        int[] integer = new int[10];

        for (int i = 0; i < integer.length; i++) {
            integer[i] = x.nextInt(21);
            for (int j = 0; j <= i;) {
                if (i != j) {
                    if (integer[j] == integer[i]) {
                        integer[i] = x.nextInt(21);
                        j = 0;
                        continue;
                    }
                }
                j++;
            }
            System.out.println("Integer " + (i + 1) + " = " + integer[i]);
        }
    }
}


