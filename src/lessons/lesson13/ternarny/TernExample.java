package lessons.lesson13.ternarny;

import lessons.lesson7.calculator.userInterface.UserOutput;

public class TernExample {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int max = 0;


        if (x > y) {
          max = x;
        } else {
            max = y;
        }

        int maxTern = (x > y) ? x : y;


        if (x == y) {
            System.out.println("переменные равны");
        } else {
            System.out.println("переменные разные");
        }

    }
}
