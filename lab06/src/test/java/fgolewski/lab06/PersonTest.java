package fgolewski.lab06;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getAge() {
        var person = new Person();
        person.birthYear = 2000;
        assertEquals(21, person.getAge(2021));
    }
}