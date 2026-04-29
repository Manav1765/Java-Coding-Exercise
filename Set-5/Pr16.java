interface Classify {
    String getDivision(double average);
}

class Result16 implements Classify {
    @Override
    public String getDivision(double average) {
        if      (average >= 70) return "First Division with Distinction";
        else if (average >= 60) return "First Division";
        else if (average >= 50) return "Second Division";
        else if (average >= 40) return "Third Division";
        else                    return "Fail";
    }
}

public class Pr16 {
    public static void main(String[] args) {
        Result16 r = new Result16();
        double[] averages = {75.0, 63.5, 52.0, 41.0, 35.0};
        for (double avg : averages) {
            System.out.printf("Average: %.1f -> %s%n", avg, r.getDivision(avg));
        }
    }
}