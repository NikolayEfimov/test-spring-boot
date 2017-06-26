package bootApp.controllers;

import bootApp.entities.Person;
import bootApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/{id}", method = POST)
    Person addPerson(@PathVariable("id") Long id) {
        Person person = new Person();
        person.setId(id);
        person.setName("person " + id);
        person.setAge(new Random().nextInt());
        return personService.save(person);
    }

    @RequestMapping(value = "/{id}")
    Person findById(@PathVariable("id") Long id) {
        Person byName = personService.findById(id);
        System.out.println("byName = " + byName);
        return byName;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    ResponseEntity delete(@PathVariable("id") Long id) {
        personService.delete(id);
        return ResponseEntity.ok().build();
    }
}
