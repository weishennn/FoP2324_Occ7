package lab2;

import java.util.Scanner;

public class L2Q1 {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        System.out.print("Enter a temperature in degree Fahrenheit: "); // this is called a prompt (for input)
        double fahrenheit = lol.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("The temperature in degree Celsius: %.2f\n", celsius);
    }
}
