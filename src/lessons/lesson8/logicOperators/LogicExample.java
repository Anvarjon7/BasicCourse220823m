package lessons.lesson8.logicOperators;

public class LogicExample {
    public static void main(String[] args) {

        /*
       логическое "умножение" -> логическое "И" - &&

       логическое "сложение" -> логическое "ИЛИ" - ||

       логическое отрицание ->  логическое "НЕ" - !
         */

        boolean bool1 = true;

        boolean bool2 = false;

        boolean bool3 = true;



        boolean result = bool1 && bool2;

        System.out.println(result);

        System.out.println("true && false " + (bool1 && bool2));
        System.out.println("true && true " + (bool1 && bool3));
        System.out.println("false && false " + (false && false));


        System.out.println("true || true " + (bool1 || bool3));
        System.out.println("true || false " + (bool1 || bool2));
        System.out.println("false || false " + (false || false));

        System.out.println("! true " + (!bool1));
        System.out.println("! false " + (!bool2));



    }
}
