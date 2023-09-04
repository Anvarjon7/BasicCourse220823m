package lessons.lesson6;

public class ReferenceVariableExample {
    public static void main(String[] args) {

        Cat cat1 = new Cat(2);

        Cat cat2 = cat1;

        System.out.println(cat2.age);

        // внести изменения в cat

        cat1.age = 3;

        // распечатаем значения НО У CAT2

        System.out.println(cat2.age);

        Cat cat3 = new Cat(4);

        System.out.println(cat3.age);


    }
}
