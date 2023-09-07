package lessons.lesson9.prctice.task1;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog = new Dog("Zeus", 2, "grey-tiger", 50.5);
        myDog.voice();
        myDog.happyBirthday();
        myDog.voice();
        myDog.changeColor("tiger");
        myDog.voice();
        myDog.changeWeight(-1.5);
        myDog.voice();

    }
}
