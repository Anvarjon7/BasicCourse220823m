package lessons.lesson6;

import kotlin.text.UStringsKt;

import java.sql.SQLOutput;

public class StringExample3 {
    public static void main(String[] args) {

        String text1 = "Java is a programming language";
        String text2 = "Java is a programming language";

        System.out.println(text2);

        text2 = text2 +"!";// конечный результат будет "Java!"

        System.out.println(text2);

// узнать длину строки

        int textLength = text2.length();

        System.out.println(textLength);

        System.out.println(text2.charAt(textLength-1));


        System.out.println(text2.substring(0,26));

        //text2 = text2.toUpperCase();

        System.out.println(text2);
        System.out.println(text2.toLowerCase());


        System.out.println(text2.replace("Java", "o"));


        System.out.println(text2.replaceAll("Java", "javaScript"));

// в строке текст может содержать набор символов в кокой-то последовательности
        //   например JAVA
        // но может быть набор символов который слегка отличается
        // например file1  и  file2  и file3
        // replace("file", "class")
        // file1asd, file2qwe ... -> class1, class2


        String word = "Orange";

        int indexLetterA = word.indexOf("a");
        System.out.println(indexLetterA);

        word = word.substring(0,indexLetterA) + 'e' + word.substring(indexLetterA+1);

        System.out.println(word);

        System.out.println(text2.contains("Java"));



    }
}
