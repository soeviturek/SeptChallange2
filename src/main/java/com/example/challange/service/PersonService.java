package com.example.challange.service;

import com.example.challange.model.Person;
import com.example.challange.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PersonService {

    //create person
    Person addPerson(Person person);

    //update person
    Person updatePerson(Person person);

    //get person
    Person getPersonById(int id);

    List<Person> getAllPersons();

    boolean deletePersonById(int id);
}
