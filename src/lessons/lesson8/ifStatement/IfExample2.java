package lessons.lesson8.ifStatement;

import lessons.lesson7.calculator.userInterface.UserInput;

// Задача: получить от пользователя положительное число до 1000 и указать какое из
// следующих числе к нему максимально приближенное: 10, 100 , 1000

public class IfExample2 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        System.out.println("введите целое число: ");
        int userInput = ui.userInputInt();

        int range10 = 10;
        int range100 = 100;
        int range1000 = 1000;


        int diff10 = Math.abs(userInput - range10); // если пользователь ввел 5 ->   5
        int diff100 = Math.abs(userInput - range100);// если пользователь ввел 5 ->   95
        int diff1000 = Math.abs(userInput - range1000);// если пользователь ввел 5 ->   995

        if (diff10 < diff100) {
            System.out.println("число введенное пользователем ближе к числу " + range10);
        }

        if (diff100 < diff1000) {
            System.out.println("число введенное пользователем ближе к числу " + range100);
        } else {
            System.out.println("число введенное пользователем ближе к числу " + range1000);
        }



//        if (diff10 < diff100) {
//            System.out.println("число введенное пользователем ближе к числу 10");
//        } else if ( diff100 < diff1000){
//            System.out.println("число введенное пользователем ближе к числу 100");
//        } else {
//            System.out.println("число введенное пользователем ближе к числу 1000");
//        }


        // альтернативный вариант
        /*
        граница между 10 и 100 и граница между 100 и 1000
        первая граница - 55
        вторая граница - 550

        если пользовательское число < границы 1 то ближе к числу 10
        если пользовательское число > границы 2 то ближе к 1000
        в противном случае значит число между границей1 и границей2 - то есть ближе к 100
         */




    }
}
