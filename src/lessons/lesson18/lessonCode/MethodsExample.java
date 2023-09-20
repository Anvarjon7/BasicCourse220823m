package lessons.lesson18.lessonCode;

public class MethodsExample {

    public int x;

    private int y;

    public MethodsExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int s(int z){
        int sumResult = x + y + z;
        printData();
        return sumResult;
    }

    private void printData(){
        System.out.println("Print data:");
    }
}
