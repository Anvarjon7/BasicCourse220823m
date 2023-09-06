package lessons.lesson8.modificators;


public class Kitchen {
    public static void main(String[] args) {
        Multivarka multvar = new Multivarka("Raymond");

        multvar.dry();

        // вариант 1 - System.out.println(multivarka.timeToTheEndCooking());

        // вариант 2 - сохранить результат работы метода в какой-то переменной


        int timeToTheEnd = multvar.timeToTheEndCooking();

        System.out.println("Время до завершения готовки: " + timeToTheEnd);
    }
}
