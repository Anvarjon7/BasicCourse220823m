package lessons.lesson17.innerClass.innerType1;

public class ZooDemo {
    public static void main(String[] args) {
        Zoo zooBerlin = new Zoo();

        Zoo.Monkey smallMonkey = zooBerlin.new Monkey();

        System.out.println(smallMonkey.getBreed());

        System.out.println(zooBerlin);
        System.out.println(smallMonkey);

        Zoo zooLeipzig = new Zoo();
        Zoo.Monkey bigMonkey = zooLeipzig.new Monkey();
        System.out.println(bigMonkey.getBreed());

        System.out.println(zooBerlin);
        System.out.println(bigMonkey);
    }
}
