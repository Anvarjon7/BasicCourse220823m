package lessons.lesson18.practice;


public class Task3 {
    /*
    Практическое задание 3
1. Создать массив типа String с размером 7.
2. Записать в него значения дней недели.
3. Вывести на консоль значение последнего элемента.
     */

    public static void main(String[] args) {

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(weekDays[weekDays.length - 1]);
    }

}
