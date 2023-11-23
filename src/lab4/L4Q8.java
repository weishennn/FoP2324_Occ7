package lab4;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random x = new Random();
        int n = x.nextInt(101);
        System.out.println("The first "+n+" prime number: ");
        boolean isPrime;
        int count = 1;
        for (int i = 2; count <=n; i++) {
            isPrime = true;
            for (int j = 2; j <= i/2 ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i+" ");
                count++;
            }
        }
    }
}