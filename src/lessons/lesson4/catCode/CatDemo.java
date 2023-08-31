package lessons.lesson4.catCode;

public class CatDemo {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.name = "Barsik";
//        cat1.age = 3;
//

        Cat catWithConstructor = new Cat("Barsik", 5);

        System.out.println("Cat name: " + catWithConstructor.name + ", age: " + catWithConstructor.age);


        Cat catWithConstructorWithOneParameter = new Cat("Murzik");

        System.out.println("Cat name: " + catWithConstructorWithOneParameter.name + ", age: " + catWithConstructorWithOneParameter.age);

        Cat catWithConstructorAge = new Cat(3);

        System.out.println("Cat name: " + catWithConstructorAge.name + ", age: " + catWithConstructorAge.age);

        Cat catWithFullConstructor = new Cat("Lucky", 4, "brit");

        System.out.println("Cat name: " + catWithFullConstructor.name + ", age: " + catWithFullConstructor.age + ", breed: " + catWithFullConstructor.breed);

    }
}
