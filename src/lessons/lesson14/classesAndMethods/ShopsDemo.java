package lessons.lesson14.classesAndMethods;

import java.util.Scanner;

public class ShopsDemo {
    public static void main(String[] args) {
        // ------ 1 вариант работы с классами и методами (конструктор по умолчанию ) -----

        ShopsInTheTownBerlin shopsInBerlin = new ShopsInTheTownBerlin();

        Scanner scanner = new Scanner(System.in);

        System.out.println("магазин Rewe открыт? - ");
        shopsInBerlin.isReweOpen = scanner.nextBoolean();

        System.out.println("магазин Edeka открыт? - ");
        shopsInBerlin.isEdekaOpen = scanner.nextBoolean();

        boolean isPossibleBuyFood = shopsInBerlin.canBuy();

        if (isPossibleBuyFood) {
            System.out.println("Магазин открыт и можно купить продукты");
        } else {
            System.out.println("Оба магазина закрыты!!! Выходной!");
        }

        // ------- 2 вариант работы (конструктор с параметрами) -----

        System.out.println("А как дела во Франкфурте?");
        System.out.println("магазин Rewe открыт? - ");
        boolean frankfurtRewe = scanner.nextBoolean();
        System.out.println("магазин Edeka открыт? - ");
        boolean frankfurtEdeka = scanner.nextBoolean();

        ShopsInTheTownFrankfurt shopsInFrankfurt = new ShopsInTheTownFrankfurt(frankfurtEdeka, frankfurtRewe);

        if (shopsInFrankfurt.canBuy()) {
            System.out.println("Магазины Франкфурта открыты и можно купить продукты");
        } else {
            System.out.println("Во Франкфурте магазины закрыты!!! Выходной!");
        }

        // ------- 3 вариант работы (использование метода с параметрами) -----

        ShopsInTheTownLeipzig shopsInLeipzig = new ShopsInTheTownLeipzig();

        System.out.println("А как дела в Лейпциге?");
        System.out.println("магазин Rewe открыт? - ");
        boolean leipzigRewe = scanner.nextBoolean();
        System.out.println("магазин Edeka открыт? - ");
        boolean leipzigEdeka = scanner.nextBoolean();

        if (shopsInLeipzig.canBuy(leipzigEdeka, leipzigRewe)) {
            System.out.println("Магазины Лейпцига открыты и можно купить продукты");
        } else {
            System.out.println("Во Лейпциге магазины закрыты!!! Выходной!");
        }

    }
}
