package lessons.lesson17.array.raceExample;

public class RaceApp {
    public static void main(String[] args) {

        CarInput carInput = new CarInput();

        // блок ввод данных

        Car[] cars = carInput.carsInput();


        System.out.println(cars[0].getModel());
        // блок расчета результата



        // блок вывода результата пользователю


    }
}
