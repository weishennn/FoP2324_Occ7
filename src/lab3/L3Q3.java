package lab3;

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        int sales = sc.nextInt();
        double commission ;
        if(sales<=100)
            commission = 0.05;
        else if(sales<=500)
            commission = 0.075;
        else if(sales<=1000)
            commission = 0.1;
        else
            commission = 0.125;
        System.out.printf("Total commission: "+"%.2f",(sales*commission));
    }
}