package lessons.lesson7.calculator;

import lessons.lesson7.calculator.service.Calculator;

import java.util.Scanner;

public class BadPracticeCalculatorApp {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("введите целое число №1 для вычислений:");

        Scanner scanner = new Scanner(System.in);
        int param1 = scanner.nextInt();

        System.out.println("введите целое число №2 для вычислений:");

        int param2 = scanner.nextInt();


        double rezult = calculator.add(param1,param2);

        System.out.println("результат сложения = " + rezult);


    }
}
