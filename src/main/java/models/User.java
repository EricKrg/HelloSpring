package models;

public class User {

    String lastName;
    String firstName;

    public User(String inLast, String inFirst){
        this.lastName = inLast;
        this.firstName = inFirst;
    }

    @Override
    public String toString() {
        return "User: " + this.firstName + "-" + this.lastName;
    }
}
