package lessons.lesson13.loop.forLoop;

public class LoopForExample3 {
    public static void main(String[] args) {

        String workString = "For loop example.";

        for (int i = 0; i < workString.length(); i++) {
            char symbolFromOurString = workString.charAt(i);
            System.out.println(i + "ый символ в нашей строке: " + symbolFromOurString);
        }

        System.out.println("-----------------------");

        int i = 0;

        while (i < workString.length()) {
            char symbolFromOurString = workString.charAt(i);
            System.out.println(i + "ый символ в нашей строке: " + symbolFromOurString);
            i++;
        }
    }
}
