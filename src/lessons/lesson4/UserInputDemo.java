package lessons.lesson4;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter text:");
        String userTextLine = scan.nextLine();
        System.out.println("Your input text: " + userTextLine);

        System.out.println("Please, enter number:");
        double userDouble = scan.nextDouble();
        System.out.println("Your input double: " + userDouble);

        System.out.println("Please, enter number:");
        int userInt = scan.nextInt();
        System.out.println("Your input int: " + userInt);

    }
}
