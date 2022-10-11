package com.example.challange.service;


import com.example.challange.model.Person;
import com.example.challange.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService{
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        Person check = personRepository.getById(person.getId());
        if(check == null){
            return personRepository.save(person);
        }
        return null;
    }

    @Override
    public Person updatePerson(Person person) {
        Person update = personRepository.getById(person.getId());
        if(update == null){
            return null;
        }
        update.setJob(person.getJob());
        update.setAge(person.getAge());
        update.setPhoneno(person.getPhoneno());
        update.setAddress(person.getAddress());
        update.setPostcode(person.getPostcode());
        personRepository.save(update);
        return update;
    }

    @Override
    public Person getPersonById(int id) {
        Person person = personRepository.getById(id);
        return person;
    }
    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public boolean deletePersonById(int id) {
        personRepository.deleteById(id);
        return true;
    }
}
