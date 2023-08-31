package lessons.lesson4;

public class LessonCode {
    public static void main(String[] args) {

        Person personOne = new Person();
        // создание экземпляра класса на основе нашего класса Person
        // который включает в себя не только поля(переменные) но и метод

        Person personTwo = new Person();

        //==========================
        // записать данные в поля экземпляров класса, ссылки на которые хранятся в personOne и personTwo


        personOne.name = "Ruslan";
        personOne.age = 29;
        personOne.town = "Berlin";


        personTwo.name = "Olga";
        personTwo.age = 21;
        personTwo.town = "Paris";

        // ==================================================
        // вызываем метод greetings() у первого и второго экземпляра класса

        personOne.greeting();
        String resultFromMethod = personOne.fromTown();
        System.out.println(resultFromMethod);


        personTwo.greeting();
        System.out.println(personTwo.fromTown());

        //==========

        System.out.println("Age of the second person is " + personTwo.age);



    }
}
