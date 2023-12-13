package Uni;

import customexception.InvalidmarkException;
import customexception.NoteligibleException;

import java.nio.InvalidMarkException;

import Uni.University;

public class StudentDetails extends University {
    String name;
    String mailid;
    int moblienumb;
    String courseid, courselevel;

    double cgpa, percentage;
    int marks[];

    public StudentDetails(String name, String mailid, int moblienumb, String courseid, String courselevel,
            double cgpa, int marks[], String university) {
        super(university);
        this.name = name;
        this.mailid = mailid;
        this.moblienumb = moblienumb;
        this.courseid = courseid;
        this.courselevel = courselevel;
        this.cgpa = cgpa;
        this.marks = marks;
    }

    public void calculate() throws InvalidmarkException, NoteligibleException {
        double sum = 0;
        for (int i : marks) {
            if (i < 0 || i > 100) {
                throw new InvalidmarkException("Marks entered is out of range");
            } else
                sum += i;
        }
        percentage = sum / 5;
        if ("UG".equals(courselevel) && percentage > 80 && maxstuall[0] != 0) {
            System.out.println("The candidate: " + name + " is admitted to BCA");
            maxstuall[0] = maxstuall[0] - 1;
        } else if ("PG".equals(courselevel) && cgpa > 7.5 && cgpa < 8.5 && maxstuall[1] != 0) {
            System.out.println("The candidate:" + name + "is admitted to MBA");
            maxstuall[1] = maxstuall[1] - 1;
        } else if ("PG".equals(courselevel) && cgpa > 8.5 && maxstuall[2] != 0) {
            System.out.println("The candidate: " + name + "is admitted to MCA");
            maxstuall[2] = maxstuall[2] - 1;
        } else {
            throw new NoteligibleException("The candidate is not eligible, sorry!!");
        }
    }

    public void Top(StudentDetails arr[]) {
        double max1 = 0.0, max2 = 0.0, max3 = 0.0;
        int index1 = 0, index2 = 0, index3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].cgpa > max1 && "BCA".equals(arr[i].courseid)) {
                max1 = arr[i].cgpa;
                index1 = i;
            } else if (arr[i].cgpa > max2 && "MBA".equals(arr[i].courseid)) {
                max2 = arr[i].cgpa;
                index2 = i;
            } else if (arr[i].cgpa > max3 && "MCA".equals(arr[i].courseid)) {
                max3 = arr[i].cgpa;
                index3 = i;
            }
        }
        System.out.println("The student :" + arr[index1].name + " is highest in BCA");
        System.out.println("The student :" + arr[index2].name + " is highest in MBA");
        System.out.println("The student " + arr[index3].name + " is highest in MCA");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Mailid" + mailid);
        System.out.println("Mobile number:" + moblienumb);
        System.out.println("Courseid: " + courseid);
        System.out.println("Course name: " + courselevel);
        System.out.println("Cgpa:" + cgpa);
    }

}
