package lessons.lesson14.methods.termometer.standart;

public class PrintConverterData {

    public void printData(String tempType1, double temp1, String tempType2, double temp2){
        System.out.println("Ваша температура:");
        System.out.println(temp1 + " градусов " + tempType1);
        System.out.println(temp2 + " градусов " + tempType2);    }
}
