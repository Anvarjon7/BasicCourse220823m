package lessons.lesson13.loop.forLoop;

import java.util.Random;
import java.util.Scanner;

public class LoopForExample5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            System.out.println(i + " number is : " + random.nextInt(49));

            System.out.println("продолжать? Y / N");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals("N")) {
                // i = 100; - первый вариант искусственного (принудительного) выхода из цикла
                break;
            }

        }
    }
}
