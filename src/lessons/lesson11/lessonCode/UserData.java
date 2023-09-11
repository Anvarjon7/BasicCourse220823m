package lessons.lesson11.lessonCode;

public class UserData {

    int numberOfShapeType; //  будем хранить номер типа нашей фигуры
    // 1 - круг, 2 - квадрат и 3 - прямоугольник
    double shapeParam1;
    double shapeParam2;
    double userAnswer;
    double correctAnswer;
    boolean checkResult;
    UserInput ui = new UserInput();
    public void inputNumberOfShapeType(){
        System.out.println("Please choice your shape: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Прямоугольник");

        numberOfShapeType = ui.userInputInteger();

        if ((numberOfShapeType <1) || (numberOfShapeType > 3)) {
            System.out.println("Ваш выбор некорректен!");
            System.exit(1);
        }
    }

    public void inputParametersOfShape(){

//        if (numberOfShapeType == 1) {
//            System.out.println("Пожалуйста введите радиус круга: ");
//            shapeParam1 = ui.userInputDouble();
//        }
//
//        if (numberOfShapeType == 2) {
//            System.out.println("Пожалуйста введите сторону квадрата: ");
//            shapeParam1 = ui.userInputDouble();
//        }
//
//        if (numberOfShapeType == 3) {
//            System.out.println("Пожалуйста введите первую сторону прямоугольника: ");
//            shapeParam1 = ui.userInputDouble();
//            System.out.println("Пожалуйста введите вторую сторону прямоугольника: ");
//            shapeParam2 = ui.userInputDouble();
//        }

        switch (numberOfShapeType) {
            case 1:
                System.out.println("Пожалуйста введите радиус круга: ");
                shapeParam1 = ui.userInputDouble();
                break;
            case 2:
                System.out.println("Пожалуйста введите сторону квадрата: ");
                shapeParam1 = ui.userInputDouble();
                break;
            case 3:
                System.out.println("Пожалуйста введите первую сторону прямоугольника: ");
                shapeParam1 = ui.userInputDouble();
                System.out.println("Пожалуйста введите вторую сторону прямоугольника: ");
                shapeParam2 = ui.userInputDouble();
                break;
        }

    }

    public void inputUserAnswer(){
        System.out.println("Пожалуйста введите свой вариант ответа: ");
        userAnswer = ui.userInputDouble();
    }








}
