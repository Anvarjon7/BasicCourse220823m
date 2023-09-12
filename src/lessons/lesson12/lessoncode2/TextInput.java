package lessons.lesson12.lessoncode2;

import java.util.Scanner;

public class TextInput {

    public String inputTextLine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        return scanner.nextLine();
    }
}
