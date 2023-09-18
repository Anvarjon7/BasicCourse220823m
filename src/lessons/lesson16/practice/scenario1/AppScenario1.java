package lessons.lesson16.practice.scenario1;

public class AppScenario1 {
    public static void main(String[] args) {


        Phone phone1 = new Phone("Apple", "iPhone 15", "black", 1800);
        Phone phone2 = new Phone("Samsung", "S22", "silver", 1500);
        Phone phone3 = new Phone("Huawei", "Duo", "red", 900);
        Phone phone4 = new Phone("Nokia", "N90", "brown", 450);
        Phone phone5 = new Phone("Sony", "xPeria", "blue", 500);

        System.out.println(phone1.getModel() + " " + phone1.getPrice());
        System.out.println(phone2.getModel() + " " + phone2.getPrice());
        System.out.println(phone3.getModel() + " " + phone3.getPrice());
        System.out.println(phone4.getModel() + " " + phone4.getPrice());
        System.out.println(phone5.getModel() + " " + phone5.getPrice());



        phone2.setPrice(1450);
        System.out.println();

        System.out.println(phone1.getModel() + " " + phone1.getPrice());
        System.out.println(phone2.getModel() + " " + phone2.getPrice());
        System.out.println(phone3.getModel() + " " + phone3.getPrice());
        System.out.println(phone4.getModel() + " " + phone4.getPrice());
        System.out.println(phone5.getModel() + " " + phone5.getPrice());




    }
}
