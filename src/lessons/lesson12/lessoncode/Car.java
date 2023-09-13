package lessons.lesson12.lessoncode;

import java.util.Random;

public class Car {

    String color;


    public String beep(String typeOfBeep){
        String carBeep = "BEEEEEEEEEEP!!!! " + typeOfBeep;
        return carBeep;
    }

    public int integerNumber() {
        System.out.println(beep("MY CAR "));
        Random random = new Random();
        int number = random.nextInt(100);
        return number;
    }



}
