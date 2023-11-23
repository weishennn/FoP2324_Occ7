package lab4;

import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int integer = sc.nextInt();
        int i=1;
        System.out.print("The factors are: ");
        while(i<=integer/2){
            if(integer%i==0)
                System.out.print(i+", ");
            i++;
        }
        System.out.print(integer);
    }
}