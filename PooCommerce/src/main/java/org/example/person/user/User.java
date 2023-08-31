package org.example.person.user;

import java.time.LocalDate;

import org.example.person.Person;

public class User extends Person{
    private String username;

    private String passowrd;

    public static User of(String firstName, String lastName){
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);

        user.setPassowrd((firstName + lastName).toUpperCase());
        user.setUsername((firstName.charAt(0) + lastName).toLowerCase());

        return null;
    }

    public User(String firstName, String lastName, LocalDate dateOfBirth, String username, String passowrd) {
        this.username = username;
        this.passowrd = passowrd;
    }

    public User(String username, String passowrd) {
        this.username = username;
        this.passowrd = passowrd;
    }

    public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
