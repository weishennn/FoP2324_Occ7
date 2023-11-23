package lab2;

import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double water = sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double iniT = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalT = sc.nextDouble();
        double M = water/1000;
        double initialTemp = (iniT-32)/1.8;
        double finalTemp = (finalT-32)/1.8;
        double Q = M*(finalTemp-initialTemp)*4184;
        System.out.printf("The energy needed is %e",Q);
    }
}
