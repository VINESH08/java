class stuclass {
    int regno;
    int[] marks;
    String name;
    char grade;
    double total, avg;

    stuclass(String name, int regno) {
        this.name = name;
        this.regno = regno;
    }

    stuclass(String name, int regno, int[] marks) {
        this(name, regno);
        this.marks = new int[5];
        if (marks.length == 5) {
            for (int i = 0; i < marks.length; i++) {
                this.marks[i] = marks[i];
            }
            // insted of for loop we can also use System.arraycoppy(marks,0,this.marks,0,5);
        }
    }

    void calcavg() {

        for (int p : marks) {
            total = total + p;
        }
        avg = (double) total / 5;// total is int so int/int gives int so convert total to double
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 75) {
            grade = 'B';
        } else if (avg >= 60) {
            grade = 'C';
        } else if (avg >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void printdet() {
        System.out.println("Name: " + name);
        System.out.println("regno: " + regno);
        System.out.println("average: " + avg);
        System.out.println("grade: " + grade);
        System.out.println("Marks: ");
        for (int p : marks) {
            System.out.print(p + " ");
        }

    }

    public static void main(String args[]) {
        stuclass sc = new stuclass("vinesh", 3292, new int[] { 89, 90, 99, 96, 99 });
        sc.calcavg();
        sc.printdet();

    }
}