package lessons.lesson12.lessoncode2;

public class CheckStringDemo {
    public static void main(String[] args) {

        // блок ввода строки от пользователя
        TextInput textInput = new TextInput();
        String userText = textInput.inputTextLine();

        // блок вычисления длины строки и его проверки

        CheckString checkString = new CheckString();
        boolean checkResult = checkString.checkText(userText);

        // блок вывода информации пользователю
        TextOutput textOutput = new TextOutput();
        textOutput.printInfo(userText, checkResult);


    }
}
