package lessons.lesson9.prctice.modificators;

public class User {

    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public boolean checkPassword(String newPassword){
        boolean isCorrectPassword = password.equals(newPassword);
        return isCorrectPassword;
    }

}
