package lessons.lesson17.array;

import java.util.Scanner;

public class ArrayExample4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите длину массива: ");
        int arraySize = scanner.nextInt();

        scanner.nextLine();

        String[] stringArray = new String[arraySize];

        for (int i = 0; i < stringArray.length; i++) {

            System.out.println("введите " + i + "-ый элемент массива: ");
            stringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(i + "-ый элемент массива: " + stringArray[i]);
        }


    }
}
