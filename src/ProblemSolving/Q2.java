package ProblemSolving;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double price=0;
        boolean run = true;
        while (run) {
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            String durian = sc.next();
            if (durian.contains("Quit"))
                run = false;
            if (run) {
                System.out.print("Enter the total sales in kg: ");
                double kg = sc.nextDouble();
                if (durian.contains("MK"))
                    price = 25;
                else if (durian.contains("HL"))
                    price = 22;
                else if (durian.contains("D24"))
                    price = 20;
                else if (durian.contains("UM"))
                    price = 18;
                total = total +price*kg;
            }
        }
        System.out.printf("Total sales: "+"%.2f",total);
    }
}
