package lab2;

import java.util.Scanner;

public class L2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int second = sc.nextInt();
        int hour= second/3600;
        int minutes = (second%3600)/60;
        int seconds = second %60;
        System.out.println(second+" seconds is "+hour+" hours, "+minutes+" minutes and "+seconds+" seconds");
    }
}
