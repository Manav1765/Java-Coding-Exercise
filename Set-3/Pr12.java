public class Ex12_VolumeOverloading {

    static double calculateVolume(double side) {
        return side * side * side;
    }

    static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    static double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        double cube   = calculateVolume(5.0);
        double cuboid = calculateVolume(4.0, 3.0, 6.0);
        double sphere = calculateVolume(7.0, true);

        System.out.printf("Volume of Cube        (side=5)              = %.4f%n", cube);
        System.out.printf("Volume of Cuboid      (4 x 3 x 6)           = %.4f%n", cuboid);
        System.out.printf("Volume of Sphere      (radius=7)            = %.4f%n", sphere);
    }
}