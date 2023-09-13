package lessons.lesson13.loop.forLoop;

public class LoopForExample6 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print("i = " + i + "; ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i % 2 > 0) {
                System.out.print("i = " + i + "; ");
            }

        }
    }
}
