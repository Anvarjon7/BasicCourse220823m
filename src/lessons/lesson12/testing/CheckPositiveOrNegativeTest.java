package lessons.lesson12.testing;

public class CheckPositiveOrNegativeTest {
    public static void main(String[] args) {
        CheckPositiveOrNegative checkClass = new CheckPositiveOrNegative();

        int userInput1 = 14;
        boolean actualResult1 = checkClass.isPositive(userInput1);
        boolean expectedResult1 = true;

        if (actualResult1 == expectedResult1) {
            System.out.println("Test 1 is OK!");
        } else {
            System.out.println("Test 1 is FAIL!");
            System.out.println("Expected result: " + expectedResult1 + ", but received: " + actualResult1 );
        }


        userInput1 = -4;
        boolean actualResult2 = checkClass.isPositive(userInput1);
        boolean expectedResult2 = false;

        if (actualResult2 == expectedResult2) {
            System.out.println("Test 2 is OK!");
        } else {
            System.out.println("Test 2 is FAIL!");
            System.out.println("Expected result: " + expectedResult2 + ", but received: " + actualResult2 );
        }
    }
}
