package lab2;

import java.util.Random;

public class L2Q5_StringFor {
    public static void main(String[] args) {
        //https://www.rapidtables.com/code/text/ascii-table.html
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Number: " + num);

        // Convert the number to a string and access each digit using charAt.
        int sum = 0;
        String numString = "" + num; // String numString = Integer.toString(num); also works
        for (int i = 0; i < numString.length(); i++)
            sum += numString.charAt(i) - '0';
        System.out.println("Sum of digits in the number: " + sum);
    }
}
