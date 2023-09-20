package lessons.lesson18.practice.task4;

public class Task4 {
    /*
    Практическое задание 4
1. Создайте класс ручка (Pen)
a. Определите свойство color типа String с доступом private
b. Создайте методы getColor(); setColor(String newColor);
2. Создайте класс Test
3. Создайте три объекта типа Pen
4. Создайте массив из ручек длиной L = 3
5. Сохраните все объекты в массив
6. Достаньте поочередно из массива ручки и измените цвет каждой на
a. “Green”
b. “Red”
c. “Black”
7. Инициализируйте массив числами от 1 до 10 используя способ литерала
8. Выведите на консоль элемент из второй ячейки
9. Распечатайте на консоль все элементы из ячеек массива
10. Проанализируйте выход в консоли
11. Распечатайте цвета ручек из массива
     */

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        // Pen[] pens = {pen1, pen2, pen3};

        Pen[] pens = new Pen[3];

        pens[0] = pen1;
        pens[1] = pen2;
        pens[2] = pen3;

        pens[0].setColor("Green");
        pens[1].setColor("Red");
        pens[2].setColor("Black");


        int[] intArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Второй элемент из массива чисел " + intArray[1]);

        System.out.println(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }

        System.out.println();

        System.out.println(pens[0].getColor());
        System.out.println(pens[1].getColor());
        System.out.println(pens[2].getColor());

        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].getColor());
        }
    }
}
