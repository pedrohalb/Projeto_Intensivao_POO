package org.example.person;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(){
    }

    public String describe(){
        return "Person: " + firstName + ", " + lastName;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(dateOfBirth, currentDate);

        return period.getYears();
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
