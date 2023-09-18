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

        int result = newPoint.increaseY(90);
        System.out.println(result);
        System.out.println(newPoint.y);



    }
}
