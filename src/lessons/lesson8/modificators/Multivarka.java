package lessons.lesson8.modificators;

import java.util.Random;

class Multivarka {

    String model;

    public Multivarka(String model) {
        this.model = model;
    }

    public void dry(){
        System.out.println("Cooking");
    }

    public int timeToTheEndCooking(){
        Random random = new Random();
        int time = random.nextInt(60);
        //....
        //.....
        //.....
        return time;
    }
}
