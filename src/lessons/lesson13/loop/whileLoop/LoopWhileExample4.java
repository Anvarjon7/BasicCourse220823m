package lessons.lesson13.loop.whileLoop;

import java.util.Random;
import java.util.Scanner;

public class LoopWhileExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean condition = true;
        int counter = 1;

        while (condition) {

            System.out.println(counter + " number is : " + random.nextInt(49));

            System.out.println("продолжать? Y / N");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals("N") || counter > 10) {condition = false;}
            counter++;

        }
    }
}
