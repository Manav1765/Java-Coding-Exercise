import java.util.Scanner;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify17 {
    String getDivision(double average);
}

class Result17 implements Exam, Classify17 {
    @Override
    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    @Override
    public String getDivision(double average) {
        if      (average >= 70) return "First Division with Distinction";
        else if (average >= 60) return "First Division";
        else if (average >= 50) return "Second Division";
        else if (average >= 40) return "Third Division";
        else                    return "Fail";
    }
}

public class Pr17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (out of 100): ");
        int    mark    = sc.nextInt();
        System.out.print("Enter average: ");
        double average = sc.nextDouble();

        Result17 result = new Result17();
        System.out.println("Passed     : " + result.isPassed(mark));
        System.out.println("Division   : " + result.getDivision(average));
        sc.close();
    }
}