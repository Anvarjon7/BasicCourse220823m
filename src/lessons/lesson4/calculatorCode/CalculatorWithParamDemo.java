package lessons.lesson4.calculatorCode;

public class CalculatorWithParamDemo {
    public static void main(String[] args) {
        CalculatorWithParameters calculator = new CalculatorWithParameters();

        double rezult = calculator.add(1000.5,400.1);

        System.out.println("Результат сложения: "  + rezult);

        double parameter1 = 500.5;
        double parameter2 = 100.5;

        rezult = calculator.add(parameter1,parameter2);

        System.out.println("результат вычитания: " + rezult);

    }
}
