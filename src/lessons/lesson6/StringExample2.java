package lessons.lesson6;

public class StringExample2 {
    public static void main(String[] args) {

        String text1 = "Java";
        String text2 = "Java";
        String text3 = "java";

        boolean check1 = (text1 == text2);

        System.out.println("Text1 тождественен text2? -> " + check1);


        boolean check2 = (text2 == text3);

        System.out.println("Text2 тождественен text3? -> " + check2);


        String text4 = new String("Java");

        boolean check3 = (text1 == text4);

        System.out.println("Text1 тождественен text4? -> " + check3);


        System.out.println(text1.equals(text2));
        System.out.println(text1.equals(text4));




    }
}
