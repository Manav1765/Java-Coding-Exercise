import java.io.*;

public class Pr27 {
    static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            bw.write("101 Alice 88");   bw.newLine();
            bw.write("102 Bob 75");     bw.newLine();
            bw.write("103 Charlie 92"); bw.newLine();
            System.out.println("Student records written to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        } finally {
            System.out.println("Write operation finished.");
        }

        System.out.println("\n--- Student Records ---");
        System.out.printf("%-10s %-12s %s%n", "Roll No", "Name", "Marks");
        System.out.println("--------------------------------");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                System.out.printf("%-10s %-12s %s%n", parts[0], parts[1], parts[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        } finally {
            System.out.println("Read operation finished.");
        }
    }
}