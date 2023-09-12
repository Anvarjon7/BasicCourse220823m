package lessons.lesson12.testing;

import java.util.Scanner;

public class CheckPositiveOrNegativeDemo {
    public static void main(String[] args) {
        CheckPositiveOrNegative check = new CheckPositiveOrNegative();

        Scanner scanner = new Scanner(System.in);
        System.out.println("пожалуйста введите число: ");
        int number = scanner.nextInt();

        boolean checkResult = check.isPositive(number);

        if (checkResult) {
            System.out.println("Вы введи положительное число!");
        } else {
            System.out.println("вы ввели отрицательное число!");
        }
    }
}
