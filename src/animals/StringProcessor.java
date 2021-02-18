package animals;

import java.util.List;

public class StringProcessor {

    static String process(String animal) {
        String lowerCaseAnimal = animal.toLowerCase();

        if (lowerCaseAnimal.contains("an ") || lowerCaseAnimal.contains("a ")) {
            return lowerCaseAnimal;
        } else {
            char c = lowerCaseAnimal.charAt(0);
            List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
            if (vowels.contains(c)) {
                return "an " + lowerCaseAnimal;
            } else {
                return "a "  + lowerCaseAnimal;
            }
        }
    }

}
