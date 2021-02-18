package animals;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AnswerProcessor {
    static List<String> positiveAnswers = List.of("y", "yes", "yeah", "yep", "sure", "right", "affirmative",
            "correct", "indeed", "you bet", "exactly", "you said it");
    static List<String> negativeAnswers = List.of("n", "no", "no way", "nah", "nope", "negative",
            "i don't think so", "yeah no");
    static List<String> askingPhrases = List.of("I'm not sure I caught you: was it yes or no?",
            "Funny, I still don't understand, is it yes or no?",
            "Oh, it's too complicated for me: just tell me yes or no.",
            "Could you please simply say yes or no?",
            "Oh, no, don't try to confuse me: say yes or no.");
    static List<String> goodbyes = List.of("See you later, alligator!", "See ya!", "Have a nice day!",
            "Bye bye!", "See ya soon!");

    static String process(String answer) {
        int length = answer.length();
        String lowerCaseAnswer;

        if (answer.contains("!") || answer.contains(".")) {
            lowerCaseAnswer = answer.toLowerCase().substring(0, length - 1).strip();
        } else {
            lowerCaseAnswer = answer.toLowerCase().strip();
        }
        return lowerCaseAnswer;
    }

    static void responseFormulator() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (scanner.hasNextLine()) {
            String answer = process(scanner.nextLine());

            if (positiveAnswers.contains(answer)) {
                System.out.println("You answered: Yes");
                break;
            }
            else if (negativeAnswers.contains(answer)) {
                System.out.println("You answered: No");
                break;
            } else {
                System.out.println(askingPhrases.get(random.nextInt(5)));
            }
        }

        System.out.println();
        System.out.println(goodbyes.get(random.nextInt(5)));
    }
}
