import java.util.*;

public class Pr29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(88);
        marks.add(72);
        marks.add(95);
        marks.add(60);
        marks.add(83);
        marks.add(45);

        System.out.println("All Marks: " + marks);

        System.out.println("Highest Mark: " + Collections.max(marks));
        System.out.println("Lowest  Mark: " + Collections.min(marks));
    }
}