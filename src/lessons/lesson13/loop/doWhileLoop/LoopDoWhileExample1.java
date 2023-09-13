package lessons.lesson13.loop.doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class LoopDoWhileExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean condition = false;
        int counter = 1;

        do {
            System.out.println(counter + " number is : " + random.nextInt(49));

            System.out.println("продолжать? Y / N");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals("N") || counter > 10) {condition = false;}
            counter++;
        }
        while (condition);
    }
}
