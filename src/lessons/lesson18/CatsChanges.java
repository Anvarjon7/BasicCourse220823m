package lessons.lesson18;

public class CatsChanges {

    public void changeCatName(Cat cat, String name) {
        cat.setName("New name + " + name);
    }

    public void changeCatsName(Cat[] cats, String name) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].setName("dzfbdzafsbhzd" + i);
        }
    }
}
