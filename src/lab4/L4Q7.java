package lab4;

import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of month (m): ");
        int N = sc.nextInt();
        double M = ((P * (i / (12 * 100))) / (1 - Math.pow((1 + (i / (12 * 100))), -N)));
        double total =0;
        System.out.println("Month        Monthly Payment        Principal        Interest        Unpaid Balance        Total Interest");
        for (int n = 1; n<=N; n++) {
            double C = M * Math.pow((1 + (i / (12 * 100))), -(1 + N - n));
            double L = M - C;
            double R= L / (i / (12 * 100)) - C;
            total = total + L;
            System.out.printf("%-2d",n);
            System.out.printf("%26.2f",M);
            System.out.printf("%17.2f",C);
            System.out.printf("%16.2f",L);
            System.out.printf("%22.2f",R);
            System.out.printf("%22.2f",total);
            System.out.println();
            //System.out.printf("%-2d%26.2f%17.2f%16.2f%22.2f%22.2f\n", n, M, C, L, R, total);
        }
    }
}