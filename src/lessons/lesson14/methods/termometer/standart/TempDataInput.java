package lessons.lesson14.methods.termometer.standart;

import java.util.Scanner;

public class TempDataInput {

    public double tempInput(String typeTemp){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные температуры в градусах " + typeTemp +":");
        double inputTemp = scanner.nextDouble();
        return inputTemp;
    }
}
