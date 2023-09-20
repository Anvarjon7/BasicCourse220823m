package lessons.lesson18.practice.task4;

public class Task4_2 {


    public static void main(String[] args) {

        Pen pen1 = new Pen();


        Pen newPen = pen1;

        Pen[] pens = {pen1};

        pens[0].setColor("Green");

        System.out.println(pen1);
        System.out.println(newPen);


        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].getColor());
        }

        newPen.setColor("White");

        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].getColor());
        }


    }
}
