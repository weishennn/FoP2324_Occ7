package lab6;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random x = new Random();
        int num1, num2, ans =0, score =0;
        while(ans>=0){
            System.out.println("Enter negative number to quit: ");
            num1 = x.nextInt(13);
            num2 = x.nextInt(13);
            System.out.print(num1+" x "+num2+" = ");
            ans = sc.nextInt();
            if(isProduct(num1,num2,ans))
                score++;
        }
        System.out.println("Your score is "+score);
    }

    public static boolean isProduct (int a, int b, int c){
        return (a * b) == c;
    }
}