package lesson3;

public class LessonCodeVariable {
    public static void main(String[] args) {
        int car1 = 1;
        int car2 = 2;
        //....


        Dog firstDog = new Dog();

        System.out.println(firstDog);

        firstDog.name = "Sharik";
        firstDog.breed = "Doberman";
        firstDog.color = "Black";
        firstDog.isMale = true;
        firstDog.age = 2;
        firstDog.weight = 45.5;


        // ======

        Dog secondDog = new Dog();

        System.out.println(secondDog);

        secondDog.name = "Barbos";
        secondDog.breed = "Pudel";
        secondDog.color = "Silver";
        secondDog.isMale = false;
        secondDog.age = 4;
        secondDog.weight = 15.5;


        System.out.println("собака номер один");
        System.out.println("Порода: "  + firstDog.breed + ", кличка: " + firstDog.name);
        System.out.println("Возраст: " + firstDog.age );
        System.out.println("Вес: " + firstDog.weight );
        System.out.println("Цвет: " + firstDog.color );
        System.out.println("Пол собаки - is male : " + firstDog.isMale );

        System.out.println("==============================");

        System.out.println("собака номер два");
        System.out.println("Порода: "  + secondDog.breed + ", кличка: " + secondDog.name);
        System.out.println("Возраст: " + secondDog.age );
        System.out.println("Вес: " + secondDog.weight );
        System.out.println("Цвет: " + secondDog.color );
        System.out.println("Пол собаки - is male : " + secondDog.isMale );


        //================================

        Dog dog3 = new Dog();

        System.out.println(dog3);

        dog3.name = "Muhtar";
        dog3.breed = "Doberman";
        dog3.color = "Black";
        dog3.isMale = true;
        dog3.age = 2;
        dog3.weight = 45.5;


        //================================





    }
}
