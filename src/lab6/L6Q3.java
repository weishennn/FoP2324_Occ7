package lab6;

import java.util.Scanner;

public class L6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.print("Enter 10 integers ( split with spaces ): ");
        String [] integer = sc.nextLine().split(" ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(integer[i]);
        }
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }

    public static void reverse(int[] num) {
        int[] reverse = new int[10];
        System.arraycopy(num, 0, reverse, 0, num.length);
        for (int i = 0; i < num.length; i++) {
            num[i] = reverse[num.length - (i + 1)];
        }
    }
}
