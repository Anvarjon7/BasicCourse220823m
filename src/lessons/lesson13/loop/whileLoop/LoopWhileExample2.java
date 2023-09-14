package lessons.lesson13.loop.whileLoop;

public class LoopWhileExample2 {
    public static void main(String[] args) {

        double x = 10;
        double y = 100;

        while (x <= 100) {
            System.out.println(" x = " + x);
            System.out.println(" y = " + y);
            System.out.println("Div result " + (y / x));
            System.out.println();

            x = x + 10;
        }


        System.out.println("Stop loop. X = " + x);

    }
}
