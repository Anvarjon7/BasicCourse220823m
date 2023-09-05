package lessons.lesson7.staticExample;

public class PersonDemo {
    public static void main(String[] args) {
        System.out.println();
        Person personOlga = new Person("Olga", "Berlin");


        System.out.println(personOlga.name);
        System.out.println(personOlga.town);



        Person personPetr = new Person("Petr", "Frankfurt");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        System.out.println("повторно проверим Ольгу");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        Person.town = "KOLN";

        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        System.out.println(personOlga.name);
        System.out.println(personOlga.town);
    }
}
