import java.util.Scanner;

class Rectangle6 {
    double width  = 1;
    double height = 1;

    Rectangle6() {}

    Rectangle6(double width, double height) {
        this.width  = width;
        this.height = height;
    }

    double getArea()      { return width * height; }
    double getPerimeter() { return 2 * (width + height); }
}

public class Pr06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle6 r1 = new Rectangle6();
        System.out.println("Default Rectangle:");
        System.out.println("  Width=" + r1.width + ", Height=" + r1.height);
        System.out.println("  Area=" + r1.getArea() + ", Perimeter=" + r1.getPerimeter());

        System.out.print("\nEnter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        Rectangle6 r2 = new Rectangle6(w, h);
        System.out.println("Custom Rectangle:");
        System.out.println("  Width=" + r2.width + ", Height=" + r2.height);
        System.out.printf("  Area=%.2f, Perimeter=%.2f%n", r2.getArea(), r2.getPerimeter());
    }
}