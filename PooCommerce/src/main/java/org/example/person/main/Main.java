package org.example.person.main;

import org.example.person.user.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        User user = new User();

        user.setFirstName("Pedro");
        user.setLastName("Barbosa");
        user.setUsername("pedrohalb");
        user.setPassowrd("ahva1s3f@d3r");
        user.setDateOfBirth(LocalDate.of(2002, 3, 5));

    }
}
