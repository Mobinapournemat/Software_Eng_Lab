package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @Test
    void insert() {
        Person person = new Person();
        PersonRepository personRepository = new PersonRepository();
        assertEquals(personRepository.insert(person), person);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }
}