package lessons.lesson14.methods.stringOperations.isPalindrome;

import java.util.Scanner;

public class CheckStringPalindromeDemo {
    public static void main(String[] args) {
        CheckStringPalindrome checkPalindrome = new CheckStringPalindrome();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text:");
        String userText = scanner.nextLine();

        boolean checkTextResult = checkPalindrome.isPalindrome(userText);

        if (checkTextResult) {
            System.out.println("Ваш текст является палиндромом");
        } else {
            System.out.println("Ваш текст НЕ является палиндромом");
        }

    }
}
