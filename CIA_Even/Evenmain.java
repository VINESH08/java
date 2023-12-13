package Uni;

import java.util.*;
import Uni.*;
import customexception.*;

public class Evenmain {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            int i;
            String name;
            String mailid;
            int moblienumb;
            String courseid, courselevel;
            double cgpa, percentage;
            int marks[] = new int[5];
            String university;
            StudentDetails arob[] = new StudentDetails[3];
            for (i = 0; i < 3; i++) {
                System.out.println("Enter name:");
                name = in.next();
                System.out.println("Enter mailid:");
                mailid = in.next();
                System.out.println("Enter moblie number: ");
                moblienumb = in.nextInt();
                System.out.println("Enter courseid:Bca ,MBA,MCA");
                courseid = in.next();
                System.out.println("Enter courselevel UG/PG:");
                courselevel = in.next();
                System.out.println("Enter CGPA:");
                cgpa = in.nextDouble();
                System.out.println("Enter marks in 5 sub:");
                for (int k = 0; k < 5; k++) {
                    marks[k] = in.nextInt();
                }
                System.out.println("Enter name of university:");
                university = in.next();

                arob[i] = new StudentDetails(name, mailid, moblienumb, courseid, courselevel, cgpa, marks, university);
                arob[i].calculate();
                // arob[i].Top(arob);
            }
            arob[0].Top(arob);

        } catch (InvalidmarkException e) {
            System.out.println(e);
        } catch (NoteligibleException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
