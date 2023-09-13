package lessons.lesson13.ternarny;

import lessons.lesson12.lessoncode3.SmallCalculator;

public class TernExample2 {
    public static void main(String[] args) {

        SmallCalculator calculator = new SmallCalculator();

        int x = 5; // пользователь ввел это число первым
        int y = 10;// пользователь ввел это число вторым


        /*
        если бы пользователь ввел значения наоборот
          int x = 10; // пользователь ввел это число первым
        int y = 5;// пользователь ввел это число вторым

      то тогда сработало бы первое условие, т е
      calculator.div(x,y)

      но у нас x < y

      поэтому вызовется
      calculator.div(y,x)

         */

        double maxTern = (x > y) ? calculator.div(x,y) : calculator.div(y,x);


    }
}
