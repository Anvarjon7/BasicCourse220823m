package lessons.lesson7.calculator;

import lessons.lesson7.calculator.service.Calculator;
import lessons.lesson7.calculator.userInterface.UserInput;
import lessons.lesson7.calculator.userInterface.UserOutput;

public class CalculatorApp {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();
        Calculator calc = new Calculator();

        System.out.println("введите первое число (возможно дробное): ");
        double firstParam = ui.userInputDouble();

        System.out.println("введите второе число (возможно дробное): ");
        double secondParam = ui.userInputDouble();


        uo.printData(
                "Результат сложения " + firstParam + " и " + secondParam + ":",
                calc.add(firstParam, secondParam));

        uo.printData(
                "Результат вычитания " + secondParam + " из " + firstParam + ":",
                calc.sub(firstParam, secondParam));


        uo.printData(
                "Результат умножения " + firstParam + " на " + secondParam + ":",
                calc.multiplication(firstParam, secondParam));


        uo.printData(
                "Результат деления " + firstParam + " на " + secondParam + ":",
                calc.div(firstParam, secondParam));



    }
}
