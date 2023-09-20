package lessons.lesson18.practice;

public class Task1 {
    /*
    Практическое задание 1
1. Создайте массив из всех нечётных чисел от 1 до 99.
2. Выведите его на экран в строку в обратном порядке
     */

    public static void main(String[] args) {

        int[] intArray = new int[50];
        int counterArray = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                intArray[counterArray] = i;
                counterArray++;
            }
        }

        for (int i = 49; i >= 0 ; i--) {
            System.out.print(intArray[i]+", ");
        }
    }
}
