class Rectangle9 {
    double width, height;

    Rectangle9(double width, double height) {
        this.width  = width;
        this.height = height;
    }

    double getArea()      { return width * height; }
    double getPerimeter() { return 2 * (width + height); }

    void display(String label) {
        System.out.println(label + ":");
        System.out.println("  Width     = " + width);
        System.out.println("  Height    = " + height);
        System.out.printf("  Area      = %.2f%n", getArea());
        System.out.printf("  Perimeter = %.2f%n", getPerimeter());
    }
}

public class Pr09 {
    public static void main(String[] args) {
        Rectangle9 r1 = new Rectangle9(4,   40);
        Rectangle9 r2 = new Rectangle9(3.5, 35.9);

        r1.display("Rectangle 1");
        System.out.println();
        r2.display("Rectangle 2");
        System.out.println();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}