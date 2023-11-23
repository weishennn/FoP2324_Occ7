package lab5;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {
        Random x = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int [] score = new int[n];
        double total = 0;
        int max = 0 ;
        int min = 100;
        for (int i =0; i<score.length;i++){
            score[i] = x.nextInt(101);
            System.out.println("Score of student "+(i+1)+" = "+score[i]);
            max = Math.max(score[i],max);
            min = Math.min(score[i],min);
            total += score[i];
        }
        System.out.println("Highest score: "+max);
        System.out.println("Lowest score: "+min);
        System.out.printf("Average score: %.2f",total/n);
    }
}