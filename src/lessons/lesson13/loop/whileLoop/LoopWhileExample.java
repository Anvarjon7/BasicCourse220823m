package lessons.lesson13.loop.whileLoop;

import java.util.Scanner;

public class LoopWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        boolean condition = true;

        while (condition) {
            System.out.println("Please enter two numbers. If you will enter first number = 100 -> exit");

            System.out.println("Please enter first number:");
            x = scanner.nextInt();

            System.out.println("Please enter second number:");
            y = scanner.nextInt();

            System.out.println("Add result = " + (x + y));

            if (x == 100) {condition = false;}

        }

        System.out.println("Stop loop while!");

    }
}
