import java.util.Scanner;

public class Student {
    private int rollno;
    private String name;
    private int[] marks = new int[5];

    // Static data members
    private static double totalAverage = 0;
    private static int studentCount = 0;

    // Parameterized constructor
    public Student(int rollno, String name, int[] marks) {
        this.rollno = rollno;
        this.name = name;
        if (marks.length == 5) {
            System.arraycopy(marks, 0, this.marks, 0, 5);
        } else {
            System.out.println("Error: Marks array should have 5 elements.");
        }

        // Update static variables for class average calculation
        totalAverage += calAvg();
        studentCount++;
    }

    static {
        System.out.println("This is executed before the constructor");
    }

    // Calculate average marks of a student
    public double calAvg() {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 5;
    }

    // Static method to compute average of class with n students
    public static double classAverage() {
        return studentCount == 0 ? 0 : totalAverage / studentCount;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", average marks=" + calAvg() + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int roll = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = sc.nextLine();

            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter mark for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            students[i] = new Student(roll, name, marks);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Class Average: " + Student.classAverage());

        sc.close();
    }
}
