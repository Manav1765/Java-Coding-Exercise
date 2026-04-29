import java.util.*;

public class Pr30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        HashMap<String, Integer> freqMap = new LinkedHashMap<>();

        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        sc.close();
    }
}
