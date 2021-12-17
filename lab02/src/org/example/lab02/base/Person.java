package org.example.lab02.base;

public class Person {
    public String firstName;
    public String lastName;
    public int birthYear;

    public void hello() {
        System.out.println(String.format("Hello, my name is %s %s", firstName, lastName));
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
