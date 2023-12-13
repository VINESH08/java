package examfeedback;

public abstract class Exam {
    String CourseCode;
    String CourseName;
    String OutOfSyllabus, standard, time, nature;

    public Exam(String CourseCode, String CourseName, String OutOfSyllabus, String standard, String time,
            String nature) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.OutOfSyllabus = OutOfSyllabus;
        this.standard = standard;
        this.time = time;
        this.nature = nature;
    }

    public abstract void displayMarks();

    public void displayExamDetails() {
        System.out.println("CourseCode:" + CourseCode);
        System.out.println("CourseName:" + CourseName);
        System.out.println("Is any questions out of syllabus:" + OutOfSyllabus);
        System.out.println("Standard of Question Paper:" + standard);
        System.out.println("is time sufficient" + time);
        System.out.println("Nature of Question paper:" + nature);

    }
}
