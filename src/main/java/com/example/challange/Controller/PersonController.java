package com.example.challange.Controller;

import com.example.challange.model.Person;
import com.example.challange.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonServiceImpl personService;

    @PostMapping("/person")
    ResponseEntity<Object> createPerson(@RequestBody Person person){
        Person check = personService.addPerson(person);
        if(check == null){
            ResponseEntity.badRequest().body("failed creating new person");
        }
        return ResponseEntity.ok("created!"+check);
    }
    @PutMapping("/person")
    ResponseEntity<Object> updatePerson(@RequestBody Person person){
        Person check = personService.updatePerson(person);
        if(check == null){
            ResponseEntity.badRequest().body("failed updating  person");
        }
        return ResponseEntity.ok("Updated!"+check);
    }
    @GetMapping("/person/{id}")
    ResponseEntity<Object> getPerson(@PathVariable("id") int id){
        Person check = personService.getPersonById(id);
        if(check == null){
            ResponseEntity.badRequest().body("failed getting person");
        }
        return ResponseEntity.ok(check);
    }
    @GetMapping("/person")
    ResponseEntity<Object> getAllPersons(){
        List<Person> list = personService.getAllPersons();
        return ResponseEntity.ok(list);
    }
    @DeleteMapping("/person/{id}")
    ResponseEntity<Object> deletePerson(@PathVariable("id") int id){
        personService.getPersonById(id);
        return ResponseEntity.ok("Deleted!");
    }
}
