package ProblemSolving;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, total, trueAns;
        num = total = trueAns = 0;
        while (num!=-1) {
            System.out.print("Enter a number (-1 to quit): ");
            num = sc.nextInt();
            if (num != -1) {
                System.out.print("Enter a factor: ");
                int factor = sc.nextInt();
                total = total + 1;
                System.out.print(factor + " is a factor of " + num + "? (true/false): ");
                String answer = sc.next();
                if ((num % factor ==0 && answer.contains("true")) | (num % factor != 0 && answer.contains("false"))){
                    System.out.println("Your answer is correct.");
                    trueAns = trueAns + 1;
                } else
                    System.out.println("Your answer is incorrect");
            }
        }
        System.out.println("The final score is "+trueAns+"/"+total);
    }
}