package lessons.lesson16.practice.scenario2;



public class AppScenario2 {
    public static void main(String[] args) {

        PhoneService service = new PhoneService();

        Phone phone1 = new Phone("Apple", "iPhone 15", "black", 1800);
        Phone phone2 = new Phone("Huawei", "Duo", "red", 900);
        Phone phone3 = new Phone("Nokia", "N90", "brown", 450);
        Phone phone4 = new Phone("Sony", "xPeria", "blue", 500);

        System.out.println(phone1.model + " " + phone1.price);
        System.out.println(phone2.model + " " + phone2.price);
        System.out.println(phone3.model + " " + phone3.price);
        System.out.println(phone4.model + " " + phone4.price);


        service.changePhonePrice(2000, phone1);
        service.changePhonePrice(1500, phone2);
        service.changePhonePrice(900, phone3);
        service.changePhonePrice(1100, phone4);

        System.out.println(phone1.model + " " + phone1.price);
        System.out.println(phone2.model + " " + phone2.price);
        System.out.println(phone3.model + " " + phone3.price);
        System.out.println(phone4.model + " " + phone4.price);



    }
}
