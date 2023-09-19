package lessons.lesson17.array.raceExample;

import java.util.Scanner;

public class CarInput {

    public Car[] carsInput(){
        // .....
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите количество автомобилей в гонке: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[arraySize];

        for (int i = 0; i < cars.length; i++) {

            System.out.println("введите марку автомобиля № " + i);
            String producer = scanner.nextLine();

            System.out.println("введите модель автомобиля № " + i);
            String model = scanner.nextLine();

            System.out.println("введите скорость автомобиля № " + i);
            int maxSpeed = scanner.nextInt();

            cars[i] = new Car(producer,model,maxSpeed);

        }

        return cars;
    }

}
