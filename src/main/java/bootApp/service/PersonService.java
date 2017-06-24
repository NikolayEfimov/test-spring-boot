package bootApp.service;

import bootApp.entities.Person;

public interface PersonService {

    Person save(Person person);

    Person findById(Long id);

    void delete(Long id);
}
