package lab8.L8Q3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=WeightCalculator.inputAge();
        System.out.print("Enter your height: ");
        double height = WeightCalculator.inputHeight();
        WeightCalculator calculator = new WeightCalculator(age, height);
        calculator.calculate();
        calculator.display();
    }
}
