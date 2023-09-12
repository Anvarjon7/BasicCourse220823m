package lessons.lesson12.lessoncode2;

public class CheckStringDemo {
    public static void main(String[] args) {
        TextInput textInput = new TextInput();
        CheckString checkString = new CheckString();
        TextOutput textOutput = new TextOutput();

        // блок ввода строки от пользователя
        String userText = textInput.inputTextLine();

        // блок вычисления длины строки и его проверки
        boolean checkResult = checkString.checkText(userText);

        // блок вывода информации пользователю
        textOutput.printInfo(userText, checkResult);

    }
}
