// ============================================================
// NOTE: In a real project, save Student.java in folder "student/"
//       and Result.java in folder "exam/". Below is the combined
//       single-file version for easy understanding.
// ============================================================

// --- student/Student.java ---
class Student {
    protected int    rollNo;
    protected String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name   = name;
    }

    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

// --- exam/Result.java ---
class Result extends Student {
    int marks1, marks2, marks3;

    Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1; marks2 = m2; marks3 = m3;
    }

    void displayResult() {
        System.out.println("========= Mark Sheet =========");
        displayStudent();
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        int    total   = marks1 + marks2 + marks3;
        double average = total / 3.0;
        System.out.println("Total   : " + total);
        System.out.printf("Average : %.2f%n", average);
        System.out.println("==============================");
    }
}

public class Pr19 {
    public static void main(String[] args) {
        Result r = new Result(101, "Arjun Mehta", 85, 78, 92);
        r.displayResult();
    }
}