package lessons.lesson9.prctice.task1;

public class Dog {

    String dogName;
    int age;
    String color;
    double weight;

    public Dog(String dogName, int age, String color, double weight) {
        this.dogName = dogName;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void voice() {
       // System.out.println(dogName + " " + age + " " + color);
        System.out.println("кличка собаки: " + dogName);
        System.out.println("возраст собаки: " + age);
        System.out.println("цвет собаки: " + color);
        System.out.println("вес собаки: " + weight);

        System.out.println();
    }

    public void happyBirthday(){
        age++; // равносильно age = age + 1;
    }

    void changeColor(String color) {
        // напишите тут команду сохранения нового цвета в свойство класса
        this.color = color;
    }

    public void changeWeight(double changeValue){
        weight = weight + changeValue;
    }



}
