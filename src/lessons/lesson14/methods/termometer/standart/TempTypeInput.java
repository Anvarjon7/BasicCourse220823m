package lessons.lesson14.methods.termometer.standart;

import java.util.Scanner;

public class TempTypeInput {

    public int userTempChoice(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста выберите тип конвертации данных:");
        System.out.println("1. Из Цельсия -> в Фаренгейт");
        System.out.println("2. Из Фаренгейта -> в Цельсия");
        System.out.println("3. Из Цельсия -> в Кельвин");
        System.out.println("4. Из Фаренгейта -> в Кельвин");
        System.out.println("5. Из Кельвин -> в Цельсия");
        System.out.println("6. Из Кельвин -> в Фаренгейт");


        int typeOfConverter = scanner.nextInt();

        return typeOfConverter;

    }

}
