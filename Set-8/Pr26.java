import java.io.*;
import java.util.Scanner;

public class Pr26 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Ex26_FileCounter <filename>");
            return;
        }
        String filename = args[0];
        int lines = 0, words = 0, chars = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                if (!line.trim().isEmpty()) {
                    String[] wordArr = line.trim().split("\\s+");
                    words += wordArr.length;
                }
            }
            System.out.println("File     : " + filename);
            System.out.println("Lines    : " + lines);
            System.out.println("Words    : " + words);
            System.out.println("Characters: " + chars);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
