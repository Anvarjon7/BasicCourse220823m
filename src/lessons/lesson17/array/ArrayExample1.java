package lessons.lesson17.array;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = -1;
        intArray[7] = 70;
        intArray[4] = -10;
        intArray[5] = 50;
        intArray[6] = 60;
        intArray[3] = 40;
        intArray[8] = 80;

        int minResultIndex = 0;

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[minResultIndex] > intArray[i]) {
                minResultIndex = i;
            }
        }

        intArray[9] = 90;

        System.out.println("Min элемент нашего массива имеет индекс:" + minResultIndex + " и его значение: " + intArray[minResultIndex]);


    }
}