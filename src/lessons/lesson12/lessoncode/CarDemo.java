package lessons.lesson12.lessoncode;

public class CarDemo {
    public static void main(String[] args) {

        Car myCar = new Car();

        // System.out.println(myCar.beep());

        String myBeepSignal = myCar.beep("MY NEW CAR");
        System.out.println(myBeepSignal);


        System.out.println(myCar.integerNumber());
    }
}
