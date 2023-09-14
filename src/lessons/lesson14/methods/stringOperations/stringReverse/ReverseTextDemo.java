package lessons.lesson14.methods.stringOperations.stringReverse;

import java.util.Scanner;

public class ReverseTextDemo {
    public static void main(String[] args) {

        ReverseText reverseText = new ReverseText();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text:");
        String userText = scanner.nextLine();

        String reverseResult = reverseText.reverseUserText(userText);

        System.out.println("ваш текст в обратном порядке выглядит так:");
        System.out.println(reverseResult);

    }
}
