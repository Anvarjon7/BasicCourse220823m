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
                userData.correctAnswer = areaCalculator.circleArea(userData.shapeParam1);
                break;
        }









    }
}
