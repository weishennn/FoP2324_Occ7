package lab4;

import java.util.Scanner;
public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integer: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        int total = 0;
        while (i<=n){
            sum+=i;
            total+=sum;
            i++;
        }
        System.out.println("Sum: "+total);

    }
}