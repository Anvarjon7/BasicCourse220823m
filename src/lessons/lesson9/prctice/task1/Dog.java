package lessons.lesson9.prctice.task1;

public class Dog {

    String dogName;

    int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    public void voice() {
        System.out.println(dogName + " " + age);
    }

    public void happyBirthday(){
        age++; // равносильно age = age + 1;

    }
}
