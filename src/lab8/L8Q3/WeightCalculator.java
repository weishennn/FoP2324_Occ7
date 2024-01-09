package lab8.L8Q3;

import java.util.Scanner;

public class WeightCalculator {
    private int age;
    private double height;

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
    }
    static int inputAge (){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static double inputHeight () {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    double calculate() {
        return (height - 100 + age / 10.0) * 0.9;
    }

    void display() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.printf("Recommend weight: %.2f" ,calculate());
    }
}

