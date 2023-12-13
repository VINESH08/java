import userexceptions.IncorrectCourseCodeException;
import userexceptions.InvalidFeedbackException;
import examfeedback.Student;
import examfeedback.*;
import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String CourseCode, name;
        int regno;
        String CourseName;
        String OutOfSyllabus, standard, time, nature;
        int mararr[] = new int[5];
        Student obj[] = new Student[3];
        try {

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter your Name");
                name = in.next();
                System.out.println("Enter your regno");
                regno = in.nextInt();
                System.out.println("Enter the CourseCode");
                CourseCode = in.next();
                System.out.println("Enter the CourseName");
                CourseName = in.next();
                System.out.println("Was the questions out of syllabus?(yes/no):");
                OutOfSyllabus = in.next();
                System.out.println("Standard of question in qp:(Good/Medium/low):");
                standard = in.next();
                System.out.println("Was the time sufficient?");
                time = in.next();
                System.out.println("Nature of qp:(Tough/medium/easy)");
                nature = in.next();
                System.out.println("Enter your 5 subject marks:");
                for (int j = 0; j < 5; j++) {
                    mararr[j] = in.nextInt();
                }
                obj[i] = new Student(CourseCode, CourseName, OutOfSyllabus, standard, time, nature, CourseName, regno,
                        mararr);
                obj[i].getfeedback();
                obj[i].displayExamDetails();
                obj[i].displayMarks();

            }
        } catch (IncorrectCourseCodeException e) {
            System.out.println(e);
        } catch (InvalidFeedbackException e) {
            System.out.println(e);
        }
    }
}
