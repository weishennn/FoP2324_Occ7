package lab8.L8Q4;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static int inputNumerator(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int inputDenominator(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    void displayLowestTerm(){
        int gcd = gcd(numerator,denominator);
        System.out.printf("Fraction reduced to lowest terms: %d/%d\n", numerator/gcd,denominator/gcd);

    }
    public int gcd(int a,int b){
        while(b>0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
