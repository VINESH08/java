import java.util.*;

class Student {
    String S_name;
    int S_age;
    String S_Dob;
    int S_aadhar;

}

class OutOfRangeException extends Exception {
    OutOfRangeException() {
        super();

    }

    OutOfRangeException(String str) {
        super(str);
    }
}

class StudentMarkDetails extends Student {
    Scanner in = new Scanner(System.in);
    int arr[] = new int[5];

    public void getdata() throws OutOfRangeException {
        System.out.println("Enter your name");
        S_name = in.next();
        System.out.println("Enter your age");
        S_age = in.nextInt();
        System.out.println("Enter your DoB");
        S_Dob = in.next();
        System.out.println("Enter your aadhar:");
        S_aadhar = in.nextInt();
        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < 0 || arr[i] > 100)
                throw new OutOfRangeException("Invalid Marks Entered");
        }
    }

    public void display() {
        System.out.println("Name:" + S_name);
        System.out.println("age:" + S_age);
        System.out.println("Dob:" + S_Dob);
        System.out.println("Aadhar:" + S_aadhar);
        System.out.println("Marks");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public void calculate() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += arr[i];
        }
        double avg = total / 5;
        System.out.println("Total:" + total);
        System.out.println("Average:" + avg);
    }
}

public class CiaQ {
    public static void main(String[] args) {
        StudentMarkDetails obj[] = new StudentMarkDetails[3];
        try {
            for (int i = 0; i < 3; i++) {
                obj[i] = new StudentMarkDetails();
                obj[i].getdata();
                obj[i].display();
                obj[i].calculate();
            }
        } catch (OutOfRangeException e) {
            System.out.println(e);
        }
    }
}