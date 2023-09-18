package lessons.lesson16.lessonCode;

public class Point {
    public int x;
    int y;

    private int z;


    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    void increment() {
        x = x + 1;
    }

    public int increaseY(int addForY){
        y = y + addForY;
        return y;
    }

    public static class PointDemo2 {
        public static void main(String[] args) {
            Point newPoint = new Point();
            newPoint.x = 15;

        }
    }
}
