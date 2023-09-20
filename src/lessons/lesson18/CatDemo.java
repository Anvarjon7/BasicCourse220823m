package lessons.lesson18;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "brit");

        System.out.println(cat.getName());

        cat.setName("Mursik");

        System.out.println(cat.getName());

        CatsChanges catsChanges = new CatsChanges();

        catsChanges.changeCatName(cat," Dexter");

        System.out.println(cat.getName());

        Cat cat2 = new Cat("Barsik2", "brit");

        Cat cat3 = new Cat("Barsik3", "brit");

        Cat[] cats = {cat, cat2, cat3};






    }
}
