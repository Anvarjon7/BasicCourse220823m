package lessons.lesson12.lessoncode;

import java.util.Scanner;

public class LessonCode1 {
    /*
    написать программу которая запрашивает у пользователя целое число
     и выводит на консоль четное оно или нет

     написать тест

     */

    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        // сценарий 1

        boolean checkNumber = (userNumber % 2) == 0;
        System.out.println("сценарий 1 ");
        if (checkNumber) {
            System.out.println("введенное число - четное");
        } else {
            System.out.println("введенное число - НЕ четное");
        }
        System.out.println();

        // сценарий 2

        CheckNumbers checks = new CheckNumbers();
        System.out.println("сценарий 2 ");

        if (checks.isEven(userNumber)) {
            System.out.println("введенное число - четное");
        } else {
            System.out.println("введенное число - НЕ четное");
        }

    }
}
