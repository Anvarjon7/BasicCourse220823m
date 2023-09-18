package lessons.lesson16.raceExample;

public class RaceApp {
    public static void main(String[] args) {
        // блок ввод данных

        Car car1 = new Car("Mercedes", "SL55 AMG", 360);

        Car car2 = new Car("BMW", "M5", 330);

        Car car3 = new Car("Lamborghini", "Diablo", 380);

        Race raceMonaco = new Race("Monaco", 75);

        // блок расчета результата

        double resultCar1 = raceMonaco.raceResultCalculate(car1);
        double resultCar2 = raceMonaco.raceResultCalculate(car2);
        double resultCar3 = raceMonaco.raceResultCalculate(car3);


        // блок вывода результата пользователю

        if (resultCar1 < resultCar2 && resultCar1 < resultCar3) {
            System.out.println("Победил автомобиль " + car1.getProducer());
        }

        if (resultCar2 < resultCar1 && resultCar2 < resultCar3) {
            System.out.println("Победил автомобиль " + car2.getProducer());
        }

        if (resultCar3 < resultCar1 && resultCar3 < resultCar2) {
            System.out.println("Победил автомобиль " + car3.getProducer());
        }

    }
}

/*
скопировать себе код и модифицировать его таким образом чтобы:
вычисление результата гонки осуществлялось отдельным методом
и вывод результата состоял не из трех блок if {} а просто System.out.println

 */