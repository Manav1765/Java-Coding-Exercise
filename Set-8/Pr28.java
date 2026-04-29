import java.io.*;

public class Pr28 {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Hello World this is Java programming");
            bw.newLine();
            bw.write("File handling is important in Java");
            bw.newLine();
            bw.write("BufferedReader reads line by line efficiently");
        } catch (IOException e) {
            System.out.println("Could not create sample file: " + e.getMessage());
        }

        int totalLines = 0, totalWords = 0, totalChars = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalLines++;
                // Count words
                if (!line.trim().isEmpty()) {
                    totalWords += line.trim().split("\\s+").length;
                }
                // Count chars excluding spaces and newline
                for (char c : line.toCharArray()) {
                    if (c != ' ') totalChars++;
                }
            }
            System.out.println("File Analysis: " + fileName);
            System.out.println("Total Lines       : " + totalLines);
            System.out.println("Total Words       : " + totalWords);
            System.out.println("Total Chars (no space): " + totalChars);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}