package lessons.lesson17.innerClass.innerType2;

public class PersonAlternativ {

    private String name;

    Account account;

    public PersonAlternativ(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPerson(){
        System.out.println("Account login: " + name + " password: " + account.password);

    }

    public class Account{
        private String password;

        public Account(String password) {
            this.password = password;
        }

        void displayAccount() {
            System.out.println("Account login: " + PersonAlternativ.this.name + " password: " + password);
        }
    }
}
