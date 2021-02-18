package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Greetings.greetUser();

        System.out.println("\n" + "Enter an animal:");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        //formulate the question (Ex: Is it a racoon?; Is it an elephant?)
        QuestionFormulator.formulate(StringProcessor.process(animal));

        AnswerProcessor.responseFormulator();
    }
}
