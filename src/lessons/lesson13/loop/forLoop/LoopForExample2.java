package lessons.lesson13.loop.forLoop;

import java.util.Random;

public class LoopForExample2 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 100; i > 0; i = i - 5) {
            int calculationResult;

            if (i % 2 == 0) {
                calculationResult = i * i * random.nextInt(100);
            } else {
                calculationResult = i * i * i * random.nextInt(1000);
            }

            System.out.println("i= " + i + " random = " + calculationResult);
        }

        for (int i = 10; i > 0; i--) {
            int calculationResult;
            int count = i * 10;

            if (i % 2 == 0) {
                calculationResult = count * count * random.nextInt(100);
            } else {
                calculationResult = count * count * count * random.nextInt(1000);
            }

            System.out.println("count= " + count + " random = " + calculationResult);
        }
    }
}
