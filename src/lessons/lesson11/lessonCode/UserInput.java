package lessons.lesson11.lessonCode;

import java.util.Scanner;

public class UserInput {

    public int userInputInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public double userInputDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
