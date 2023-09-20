package lessons.lesson17.innerClass.innerType2;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setAccount(String password) {
        class Account{

            String accountNumber = "12345";

            void printData(){
                System.out.println("Account login: " + name + " password: " + password);
            }
        }

        Account account = new Account();
        account.printData();
        System.out.println(account.accountNumber);
    }
}
