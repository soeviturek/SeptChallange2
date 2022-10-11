package com.example.challange.service;


import com.example.challange.model.Person;
import com.example.challange.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
//        Person check = personRepository.getReferenceById(person.getId());
//        if(check == null){
//            return personRepository.save(person);
//        }
//        return null;
        System.out.println("");
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        Optional<Person> check = personRepository.findById(person.getId());
        Person update = null;
        if(check.isPresent()){
            update = check.get();
            update.setJob(person.getJob());
            update.setAge(person.getAge());
            update.setPhoneno(person.getPhoneno());
            update.setAddress(person.getAddress());
            update.setPostcode(person.getPostcode());
            personRepository.save(update);
        }
        return update;
    }

    @Override
    public Person getPersonById(int id) {
        Optional<Person> check = personRepository.findById(id);
        if(check.isPresent()){
            return check.get();
        }
        return null;
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
