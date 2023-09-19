package lessons.lesson17.array;

import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите длину массива: ");
        int arraySize = scanner.nextInt();

        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {

            System.out.println("введите " + i + "-ый элемент массива: ");
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Идет поиск минимального элемента!");


        int minResultIndex = 0;

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[minResultIndex] > intArray[i]) {
                minResultIndex = i;
            }
        }

        System.out.println("Min элемент нашего массива имеет индекс:" + minResultIndex + " и его значение: " + intArray[minResultIndex]);

    }
}
