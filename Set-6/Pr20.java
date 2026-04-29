public class Pr20 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Usage: java Ex20_DivisionException <numerator> <denominator>");
            }
            int numerator   = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            double result = (double) numerator / denominator;
            System.out.printf("Result: %d / %d = %.4f%n", numerator, denominator, result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Both arguments must be integers. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Argument Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution finished.");
        }
    }
}
