package lessons.lesson4.calculatorCode;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.x = 1000;
        calc.y = 400;

        System.out.println(calc.add());

        double resultOfSub = calc.sub();
        System.out.println(resultOfSub);

        System.out.println(calc.mult());

        double resultOfDiv = calc.div();
        System.out.println(resultOfDiv);

    }
}
