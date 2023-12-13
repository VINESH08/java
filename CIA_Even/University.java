package Uni;

public abstract class University {
    public String university;
    public String courses[] = { "BCA", "MBA", "MCA" };
    public static int maxstuall[] = { 3, 2, 2 };

    public University(String university) {
        this.university = university;

    }

    public abstract void displayDetails();
}