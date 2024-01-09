package lab9.L9Q3;

import lab9.L9Q2.PersonProfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lecturer extends PersonProfile {
    private String[] course;
    private String[] courseCode;
    private int[] semester;
    private int[] session;
    private int[] creditHour;
    private int[] registeredStudents;

    public Lecturer(String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);

        try {
            Scanner inputStream = new Scanner(new FileInputStream("lecturer.txt"));
            // get the number of courses
            int line = 0;
            while (inputStream.hasNextLine()) {
                inputStream.nextLine();
                line++;
            }
            inputStream.close();

            int numberOfCourses = line / 6;
            course = new String[numberOfCourses];
            courseCode = new String[numberOfCourses];
            semester = new int[numberOfCourses];
            session = new int[numberOfCourses];
            creditHour = new int[numberOfCourses];
            registeredStudents = new int[numberOfCourses];

            inputStream = new Scanner(new FileInputStream("lecturer.txt"));
            for (int i = 0; inputStream.hasNextLine(); i++) {
                courseCode[i] = inputStream.nextLine();
                course[i] = inputStream.nextLine();
                semester[i] = inputStream.nextInt();
                session[i] = inputStream.nextInt();
                creditHour[i] = inputStream.nextInt();
                registeredStudents[i] = inputStream.nextInt();
                if (inputStream.hasNextLine()) inputStream.nextLine();
            }
            inputStream.close();
            computeCreditHour();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }


    private void computeCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            int numOfStudents = registeredStudents[i];

            if (numOfStudents >= 150) creditHour[i] *= 3;
            else if (numOfStudents >= 100) creditHour[i] *= 2;
            else if (numOfStudents >= 50) creditHour[i] *= 1.5;
            else creditHour[i] *= 1;
        }
    }
    public String toString() {
        String str = super.toString() + "\n";
        for (int i = 0; i < courseCode.length; i++) {
            str += "\nCourse name: " + course[i] +
                    "\nCourse code: " + courseCode[i] +
                    "\nSemester: " + semester[i] +
                    "\nSession: " + session[i] +
                    "\nCredit hour: " + creditHour[i] +
                    "\nRegistered students: " + registeredStudents[i] + "\n";
        }
        return str;
    }
}


