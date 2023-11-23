package lab3;

import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number= ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int total = 0;
        System.out.print("Enter an operand: ");
        char ope = sc.next().charAt(0);
        switch (ope) {
            case '+' -> total = num1 + num2;
            case '-' -> total = num1 - num2;
            case '*' -> total = num1 * num2;
            case '/' -> total = num1 / num2;
            case '%' -> total = num1 % num2;
        }

//        switch(ope){
//            case '+':{
//                total = num1 + num2;
//                break;
//            }
//   }
        System.out.println(num1+" "+ope+" "+num2+" = "+total);
      //  System.out.printf();
    }
}