package lessons.lesson12.lessoncode2;

import lessons.lesson12.lessoncode.CheckNumbers;

public class CheckString {

    public boolean checkText(String userText){
        int textLength = userText.length();

        CheckNumbers checkNumbers = new CheckNumbers();

        boolean checkResult = checkNumbers.isEven(textLength);

        return checkResult;
    }
}
