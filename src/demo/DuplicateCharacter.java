package demo;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "What are you Areena";

        // Convert the string to a stream of characters and group them by their count


       Map<Character, Long> charCounts = str.chars()
         .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Print the duplicate characters
        System.out.print("Duplicate characters in \"" + str + "\": ");
        charCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .forEach(c -> System.out.print(c + "   "));
    }
}
