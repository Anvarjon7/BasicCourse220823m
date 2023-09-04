package lessons.lesson6;

public class CastTypeExample {
    public static void main(String[] args) {

        byte v1 = 100;

        int v2 = v1;

        int v3 = 127;// -> 0111 1111
        // -128 -> 1111 1111

        // 1 -> 0000 0001
        //-1 -> 1000 0001

        byte v4 = (byte) v3;

        System.out.println(v4);


        int int1 = 1000000000;

        long long1 = int1;

        System.out.println(long1);

        long long2 = 10000000000L;

        int int2 = (int) long2;

        System.out.println(int2);

        char ch1 = '0';

        int int_ch1 = ch1;

        System.out.println(int_ch1);

    }
}
