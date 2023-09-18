package lessons.lesson16.lessonCode;

public class PointDemo {
    public static void main(String[] args) {
        Point newPoint = new Point();
        newPoint.x = 5;
        newPoint.y = 10;
        newPoint.setZ(25);
        System.out.println(newPoint.getZ());

        newPoint.increment();
        System.out.println(newPoint.x);

        System.out.println(newPoint.increaseY(90));



    }
}
