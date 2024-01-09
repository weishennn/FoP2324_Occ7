package lab7;

import java.io.*;
import java.util.Scanner;
public class L7Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("text.txt"));
            System.out.print("Enter the text or enter save to exit: ");
            String line;
            while (true) {
                line = sc.nextLine();
                if (!line.equals("save")) outputStream.write(line + "\n");
                else break;
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        try {
            int character = 0, word = 0, line = 0;
            Scanner inputStream = new Scanner(new FileInputStream("text.txt"));
            while (inputStream.hasNextLine()) {
                String input = inputStream.nextLine();
                character += input.length();
                word += input.split(" ").length;
                line++;
            }
            System.out.println("Number of character: "+character);
            System.out.println("Number of word: "+word);
            System.out.println("Number of line: "+line);
            inputStream.close();
        }
        catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
