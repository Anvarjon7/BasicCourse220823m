package lessons.lesson8.ifStatement;

import lessons.lesson7.calculator.userInterface.UserInput;

public class IfExample1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        System.out.println("введите целое число: ");
        int userInput = ui.userInputInt();

        if (userInput > 0) {
            System.out.println("Число которое вы ввели - положительное и больше 0");
        } else if (userInput < 0){
            System.out.println("Число которое вы ввели - отрицательное и меньше 0");
        } else {
            System.out.println("Число которое вы ввели - равно 0");
        }


        if (userInput > 0) {
            System.out.println("Число которое вы ввели - положительное и больше 0");
        }

        if (userInput < 0){
            System.out.println("Число которое вы ввели - отрицательное и меньше 0");
        }

        if (userInput == 0) {
            System.out.println("Число которое вы ввели - равно 0");
        }




    }
}
