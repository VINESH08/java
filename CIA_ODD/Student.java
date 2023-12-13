
package examfeedback;

import java.util.Scanner;

import examfeedback.*;
import userexceptions.*;

public class Student extends Exam implements Feedback {
    String name;
    int regno;
    int arr[];

    public Student(String CourseCode, String CourseName, String OutOfSyllabus, String standard, String time,
            String nature,
            String name, int regno, int arr[]) throws IncorrectCourseCodeException {

        super(CourseCode, CourseName, OutOfSyllabus, standard, time, nature);
        if (!CourseCode.equals("BITR101") && !CourseCode.equals("CSE101") && !CourseCode.equals("CSE105")
                && !CourseCode.equals("ECE102R02"))
            throw new IncorrectCourseCodeException("Invalid Course code!");
        this.name = name;
        this.regno = regno;
        this.arr = arr;
    }

    Scanner in = new Scanner(System.in);

    @Override
    public void getfeedback() throws InvalidFeedbackException {
        System.out.println("Enter your Overall feedback");
        String input = in.nextLine();
        if (input.length() < 10)
            throw new InvalidFeedbackException("Feedback length must be atleast 10 charactes long");
        System.out.println(input);
    }

    @Override
    public void displayMarks() {
        System.out.println("Name:" + name);
        System.out.println("Regno:" + regno);
        System.out.println("Marks in 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }

}
