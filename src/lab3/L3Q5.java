package lab3;

import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        System.out.print("Enter the value of d: ");
        double d = sc.nextDouble();
        System.out.print("Enter the value of e: ");
        double e = sc.nextDouble();
        System.out.print("Enter the value of f: ");
        double f = sc.nextDouble();
        double x , y;
        if(a*d-b*c==0)
            System.out.println("The equation has no solution");
        else {
            x =  (e * d - b * f) / (a * d - b * c);
            y =  (a * f - e * c) / (a * d - b * c);
            System.out.println("x = "+x+" y= "+y);
        }
    }
}
