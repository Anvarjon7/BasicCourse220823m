package lessons.lesson9.prctice.modificators.entity;

public class BankAccount {

    private String holderName;
    private String holderSurname;
    private double balance;
    private String accountNumber;

    public BankAccount(String holderName, String holderSurname, double balance, String accountNumber) {
        this.holderName = holderName;
        this.holderSurname = holderSurname;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderSurname() {
        return holderSurname;
    }

    public void setHolderSurname(String holderSurname) {
        this.holderSurname = holderSurname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
