package lessons.lesson8.unarOperator;

public class CountExample {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        counter.increment();
        counter.increment();
        counter.increment();


        int currentCounter = - counter.count;

        System.out.println(currentCounter);
    }
}
