package lab4;

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int total = 0;
        double N = 0;
        int max = 0;
        int min = 100;
        int xSquare = 0;
        while (score >= 0) {
            System.out.print("Enter a score [negative score to quit]: ");
            score = sc.nextInt();
            if(score>=0) {
                N++;
                total += score;
                max = Math.max(score, max);
                min = Math.min(score, min);
                xSquare += Math.pow(score, 2);
            }
        }

        double standardDeviation = Math.sqrt((xSquare-(Math.pow(total,2))/N)/(N-1));
        System.out.printf(("%.1f"),Math.pow(standardDeviation,2));
        System.out.println("\nMinimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        System.out.printf("Average Score: "+("%.2f"),total/N);
        System.out.printf("\nStandard Deviation: "+("%.2f"),standardDeviation);
    }
}