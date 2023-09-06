package lessons.lesson8.unarOperator;

public class Counter {

    int count;

    public Counter(int count) {
        this.count = count;
    }

    public void increment(){
        count++; // count = count + 1;
    }

    public void decrement(){
        count--;// count = count - 1;
        // --count;
    }

}
