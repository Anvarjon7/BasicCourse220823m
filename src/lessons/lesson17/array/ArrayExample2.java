package lessons.lesson17.array;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] intArray = {10,20,-1,30,40,-10,60,70,80,90};

        intArray[9] = -190;

        int minResultIndex = 0;

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[minResultIndex] > intArray[i]) {
                minResultIndex = i;
            }
        }

        System.out.println("Min элемент нашего массива имеет индекс:" + minResultIndex + " и его значение: " + intArray[minResultIndex]);

    }
}
