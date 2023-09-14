package lessons.lesson14.methods.termometer.standart;

import lessons.lesson14.methods.termometer.TemperatureConverter;

public class TempConverterDemoStandartWay {
    public static void main(String[] args) {
        // создание экземпляров наших классов для работы с их методами
        TemperatureConverter converter = new TemperatureConverter();
        TempTypeInput typeInput = new TempTypeInput();
        TempDataInput dataInput = new TempDataInput();
        PrintConverterData printData = new PrintConverterData();

        // последовательное использование методов из экземпляров классов

        int typeOfConverter = typeInput.userTempChoice();
        double sourceOfTemp = 0;
        double resultOfConvert = 0;


        if (typeOfConverter == 1) {
          sourceOfTemp = dataInput.tempInput("Цельсия");
          resultOfConvert = converter.fromCelsiusToFahrenheit(sourceOfTemp);
          printData.printData("Цельсия" ,sourceOfTemp, "Фаренгейт", resultOfConvert);
        }

        if (typeOfConverter == 2) {
            sourceOfTemp = dataInput.tempInput("Фаренгейт");
            resultOfConvert = converter.fromFahrenheitToCelsius(sourceOfTemp);
            printData.printData("Фаренгейт" ,sourceOfTemp, "Цельсия", resultOfConvert);
        }

        if (typeOfConverter == 3) {
            sourceOfTemp = dataInput.tempInput("Цельсия");
            resultOfConvert = converter.fromCelsiusTokelvin(sourceOfTemp);
            printData.printData("Цельсия" ,sourceOfTemp, "Кельвин", resultOfConvert);
        }


        if (typeOfConverter < 1 || typeOfConverter > 6) {
            System.out.println("Некорректный выбор");
        }

    }
}
