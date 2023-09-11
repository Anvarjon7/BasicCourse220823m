package lessons.lesson11.lessonCode;

public class SquareCalculatorDemo {
    public static void main(String[] args) {

        UserData userData = new UserData();
        ShapeAreaCalculator areaCalculator = new ShapeAreaCalculator();

        // блок взаимодействия с пользователем и получения данных
        userData.inputNumberOfShapeType();
        userData.inputParametersOfShape();
        userData.inputUserAnswer();

        // блок расчета

        switch (userData.numberOfShapeType){
            case 1:
                userData.correctAnswer = ((int) (100 * areaCalculator.circleArea(userData.shapeParam1))) / 100.0;
                break;
            case 2:
                userData.correctAnswer = areaCalculator.squareArea(userData.shapeParam1);
                break;
            case 3:
                userData.correctAnswer = areaCalculator.rectangleArea(userData.shapeParam1, userData.shapeParam2);
                break;
        }

        // блок анализа ответов и сравнения

        userData.checkResult = (userData.userAnswer == userData.correctAnswer);

        if (userData.checkResult) {
            System.out.println("Ваш ответ правильный! МОЛОДЕЦ!!!");
        } else {
            System.out.println("Ваш ответ НЕ ПРАВИЛЬНЫЙ (((");
            System.out.println("Правильный ответ: "  + userData.correctAnswer);
        }










    }
}
