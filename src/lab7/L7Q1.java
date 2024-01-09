package lab7;

import java.io.*;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            outputStream.writeUTF("WXES1116,Programming I ");
            outputStream.writeUTF("WXES1115,Data Structure ");
            outputStream.writeUTF("WXES1110,Operating System ");
            outputStream.writeUTF("WXES1112,Computing Mathematics I");
            outputStream.close();

        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
        System.out.print("Enter Course Code: ");
        String code = sc.next();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));
            while (true) {
                String[] course = inputStream.readUTF().split(",");
                if (code.equals(course[0])) {
                    System.out.print("Course Name: " + course[1]);
                    break;
                }
            }
           inputStream.close();
        } catch (EOFException e) {
            System.out.println("Course not found");
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }
}