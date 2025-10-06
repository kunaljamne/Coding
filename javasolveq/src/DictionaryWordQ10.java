import java.util.*;

public class DictionaryWordQ10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        // Split by whitespace (since input has only alphabetic words separated by spaces)
        String[] words = str.split("\\s+");

        Map<String, Integer> table = new HashMap<>();

        for (String word : words) {
            table.put(word, table.getOrDefault(word, 0) + 1);
        }

        // Collect only words that appear more than once
        List<String> repeatedWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedWords.add(entry.getKey());
            }
        }

        // Sort in lexicographical order (case-sensitive)
        Collections.sort(repeatedWords);

        // Print result
        if (repeatedWords.isEmpty()) {
            System.out.println("No repeated words");
        } else {
            for (String word : repeatedWords) {
                System.out.print(word+" ");
            }
        }
    }
}
