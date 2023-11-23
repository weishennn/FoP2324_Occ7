package lab3;

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the coordinate (x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((Math.pow(x, 2) + Math.pow(y, 2)) < Math.pow(radius, 2))
            System.out.println("The point is inside the circle. ");
        else if ((Math.pow(x, 2) + Math.pow(y, 2)) > Math.pow(radius, 2))
            System.out.println("The point is outside the circle. ");
        else System.out.println("The point is on the circle. ");
    }
}