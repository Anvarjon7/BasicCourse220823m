package lessons.lesson11.lessonCode;

public class ShapeAreaCalculator {

    public double circleArea(double radius){
        // площадь круга pi * radius ^ 2
        double area = 3.1415 * radius * radius;
        return area;
    }

    public double squareArea(double sideA){
        // площадь квадрата sideA * sideA
        return sideA * sideA;
    }

    public double rectangleArea(double sideA, double sideB) {
        return sideA * sideB;
    }

}
