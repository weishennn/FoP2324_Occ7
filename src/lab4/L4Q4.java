package lab4;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ... , 6 for Saturday: ");
        int day = sc.nextInt();
        int dayBeforeMay = 31 + 28 + 31 + 30 + day;
        int dayBeforeAugust = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            dayBeforeMay++;
            dayBeforeAugust++;
        }
        day = dayBeforeMay % 7;
        System.out.println("                  MAY "+year);
        System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        for (int i = 0; i < day; i++)
            System.out.print("      ");
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%6d", i);
            if (((i + day) % 7 == 0)||i==31)
                System.out.println();
        }
        day = dayBeforeAugust  % 7;
        System.out.println("\n                  AUG "+year);
        System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        for (int i = 0; i < day; i++)
            System.out.print("      ");
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%6d", i);
            if (((i + day) % 7 == 0)||i==31)
                System.out.println();
        }
    }
}