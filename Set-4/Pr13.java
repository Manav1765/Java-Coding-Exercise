import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle13 extends Shape {
    double calculateArea() {
        return d1 * d2;
    }
}

public class Pr13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle tri = new Triangle();
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        tri.getData(base, height);
        System.out.printf("Area of Triangle   = %.2f%n", tri.calculateArea());

        Rectangle13 rect = new Rectangle13();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        System.out.print("Enter height of rectangle: ");
        double h = sc.nextDouble();
        rect.getData(w, h);
        System.out.printf("Area of Rectangle  = %.2f%n", rect.calculateArea());

        sc.close();
    }
}