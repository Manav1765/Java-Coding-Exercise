import java.util.Scanner;

class Point {
    double x, y;

    Point() {
        x = 5; y = 5;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.printf("Point(%s, %s)%n", x, y);
    }
}

public class Pr08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        System.out.print("Default constructor -> ");
        p1.display();

        System.out.print("Enter x: "); double x = sc.nextDouble();
        System.out.print("Enter y: "); double y = sc.nextDouble();
        Point p2 = new Point(x, y);
        System.out.print("Parameterized constructor -> ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("Copy constructor (copy of p2) -> ");
        p3.display();

        sc.close();
    }
}