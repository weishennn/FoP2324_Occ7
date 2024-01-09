package lab7;

import java.io.*;
import java.util.Scanner;
public class L7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
            System.out.print("Enter the text or enter save to exit: ");
            String line;
            while (true) {
                line = sc.next();
                if (!line.equals("save")) outputStream.write(line + " ");
                else break;
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        try {
            PrintWriter outputStream2 = new PrintWriter(new FileOutputStream("reverse.txt"));
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
            while (inputStream.hasNext()) {
                String reverse = "";
                String input = inputStream.next();
                for (int i = input.length() - 1; i >= 0; i--)
                    reverse += input.charAt(i);
                outputStream2.write(reverse + " ");
            }

            outputStream2.close();
        } catch (IOException f) {
            System.out.println("Problem with file output");
        }
    }
}
