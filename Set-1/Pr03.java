import java.util.Scanner;

public class Pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("It is a Vowel.");
        } else if(Character.isLetter(ch)) {
            System.out.println("It is a Consonant.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}