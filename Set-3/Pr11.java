import java.util.Scanner;

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        void acceptStudentInfo() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void displayAdmissionDetails() {
            System.out.println("=== Admission Details ===");
            System.out.println("College Name : " + collegeName); // accessing outer class member
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }
}

public class Pr11 {
    public static void main(String[] args) {
        College college       = new College("Shree Swami Atmanand Saraswati Institute of Technology");
        College.Admission adm = college.new Admission();
        adm.acceptStudentInfo();
        adm.displayAdmissionDetails();
    }
}