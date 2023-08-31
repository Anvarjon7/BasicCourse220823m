package lessons.lesson4;

public class Person {

    String name;
    int age;
    String town;


    public void greeting() {
        System.out.println("Hello! My name is " + name);
    }

    public String fromTown() {
        String personFromTown = "I am from town " + town;
        return personFromTown;
    }

}
