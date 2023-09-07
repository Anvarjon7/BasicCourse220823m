package lessons.lesson9.prctice.modificators;

import lessons.lesson9.prctice.modificators.entity.BankAccount;

public class AccountApp {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Luiza", "Smith", 15000, "LV123r42115125");

        System.out.println(myAccount.getHolderName());
        System.out.println(myAccount.getHolderSurname());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getAccountNumber());
        System.out.println();

        myAccount.setBalance(21000);

        System.out.println(myAccount.getHolderName());
        System.out.println(myAccount.getHolderSurname());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getAccountNumber());




    }
}
