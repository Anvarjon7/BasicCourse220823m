package lessons.lesson11.homeworkCode;

import lessons.lesson7.calculator.userInterface.UserInput;

public class ColbaDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        CheckColba checkColba = new CheckColba();

        System.out.println("Please enter temperature for first colba: ");
        double tempFirstColba = ui.userInputDouble();

        System.out.println("Please enter temperature for second colba: ");
        double tempSecondColba = ui.userInputDouble();

        System.out.println("Your device is working correctly? - " + checkColba.checkTemp(tempFirstColba, tempSecondColba));

    }
}
