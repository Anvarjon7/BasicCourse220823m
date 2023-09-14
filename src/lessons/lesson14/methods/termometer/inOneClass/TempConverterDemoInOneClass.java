package lessons.lesson14.methods.termometer.inOneClass;

import lessons.lesson14.methods.termometer.TemperatureConverter;

import java.util.Scanner;

public class TempConverterDemoInOneClass {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста выберите тип конвертации данных:");
        System.out.println("1. Из Цельсия -> в Фаренгейт");
        System.out.println("2. Из Фаренгейта -> в Цельсия");

        int typeOfConverter = scanner.nextInt();

        double tempConverterResult = 0;

        if (typeOfConverter == 1) {
            System.out.println("Введите данные температуры с градусах Цельсия:");
            double celsiusTemp = scanner.nextDouble();
            tempConverterResult = converter.fromCelsiusToFahrenheit(celsiusTemp);

            System.out.println("Ваша температура:");
            System.out.println(celsiusTemp + " градусов Цельсия");
            System.out.println(tempConverterResult + " градусов Фаренгейта");
        }

        if (typeOfConverter == 2) {
            System.out.println("Введите данные температуры с градусах Фаренгейта:");
            double fahrTemp = scanner.nextDouble();
            tempConverterResult = converter.fromFahrenheitToCelsius(fahrTemp);

            System.out.println("Ваша температура:");
            System.out.println(fahrTemp + " градусов Фаренгейта");
            System.out.println(tempConverterResult + " градусов Цельсия");
        }

        if (typeOfConverter < 1 || typeOfConverter > 2) {
            System.out.println("Некорректный выбор");
        }

    }
}
