package lessons.lesson14.methods.stringOperations.isPalindrome;

import java.util.Locale;

public class CheckStringPalindrome {

    public boolean isPalindrome(String checkText){
        /*
        - убрать из строки пробелы, привести к одному регистру (большие буквы)
        - в цикле пройтись по всей строке и сравнить посимвольно начало и конец
          А РОЗА УПАЛА НА ЛАПУ АЗОРА
          АРОЗАУПАЛАНАЛАПУАЗОРА

          AAABBB|BBBAAA
          AAABBBCBBBAAA

         */

        String updateText = checkText.replace(" ","").toUpperCase();
        int textLength = updateText.length();

        for (int i = 0; i < textLength/2; i++) {
            if (updateText.charAt(i) != updateText.charAt(textLength-1-i)) {
                /*
                i = 0
                charAt(0) != charAt(length() -1) -> length() - 1 - последний индекс строки

                i = 1
                charAt(1) != charAt(length() -1 -1) -> length() - 2 - предпоследний индекс строки

                 i = 2
                charAt(2) != charAt(length() -1 -2) -> length() - 3 - предпредпоследний индекс строки

                 */
                return false;
            }
        }

        return true;
    }
}
