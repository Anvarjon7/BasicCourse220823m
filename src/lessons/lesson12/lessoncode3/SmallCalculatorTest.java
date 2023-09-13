package lessons.lesson12.lessoncode3;

public class SmallCalculatorTest {
    public static void main(String[] args) {

        SmallCalculator calculator = new SmallCalculator();

        // ------ TEST for method multiplication ---------
        double x = 5.5;
        double y = 5;

        double expectedResult1 = 27.5;
        double actualResult1 = calculator.multiplication(x,y);

        printTestResult("multiplication", actualResult1, expectedResult1);


        // ------ TEST for method div  ---------

        double expectedResult2 = 1.1;
        double actualResult2 = calculator.div(x,y);

        printTestResult("2", actualResult2, expectedResult2);
    }

    public static void printTestResult(String numberOfTest, double result1, double result2){
        if (result1 == result2) {
            System.out.println("Test " + numberOfTest + " is OK!");
        } else {
            System.out.println("Test " + numberOfTest + "  is FAIL!");
            System.out.println("Expected result: " + result2 + ", but received: " + result1 );
        }
    }
}
