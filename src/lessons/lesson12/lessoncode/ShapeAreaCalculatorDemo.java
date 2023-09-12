package lessons.lesson12.lessoncode;

import java.util.Scanner;

public class ShapeAreaCalculatorDemo {
    public static void main(String[] args) {
        /*

1. Спросить расчет площади какой фигуры пользователь делает
2. Ввод порядкового номера фигуры
3. Запросить у пользователя параметры фигуры (радиус, две стороны прямоугольника и ...)
4. Запросить его вариант решения (свой ответ)
--------- взаимодействие с пользователем завершено ---------
5. вычислить площадь фигуры в зависимости от данных пользователя
6. сравнить наш результат с ответом пользователя
---------- завершен этап проверки ответа пользователя --------
7. сообщить пользователя о том его ответ корректен или нет

         */

        System.out.println("Please choice your shape: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Прямоугольник");

        Scanner scanner = new Scanner(System.in);

        int shapeType = scanner.nextInt();

        double shapeParam1 = 0;
        double shapeParam2 = 0;
        double calculatedArea = 0;

        switch (shapeType) {
            case 1:
                System.out.println("введите радиус круга: ");
                shapeParam1 = scanner.nextDouble();
                calculatedArea = 3.1415 * shapeParam1 * shapeParam1;
                break;
            case 2:
                System.out.println("введите сторону квадрата: ");
                shapeParam1 = scanner.nextDouble();
                calculatedArea = shapeParam1 * shapeParam1;
                break;
            case 3:
                System.out.println("введите первую сторону прямоугольника: ");
                shapeParam1 = scanner.nextDouble();
                System.out.println("введите вторую сторону прямоугольника: ");
                shapeParam2 = scanner.nextDouble();
                calculatedArea = shapeParam1 * shapeParam2;
                break;
            default:
                System.out.println("ваш выбор не корректен!");
                System.exit(1);
        }

        System.out.println("введите ваш вариант ответа: ");
        double userAnswer = scanner.nextDouble();

        boolean checkUserAnswer = (userAnswer == calculatedArea);

        if (checkUserAnswer) {
            System.out.println("ответ правильный!");
        } else {
            System.out.println("ответ НЕ ВЕРНЫЙ");
            System.out.println("правильный ответ: "  + calculatedArea);
        }




    }
}
