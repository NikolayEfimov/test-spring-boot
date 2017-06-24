package bootApp.service.impl;

import bootApp.entities.Person;
import bootApp.repositories.PersonRepository;
import bootApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(Long id) {
        return personRepository.findById(id);

    }

    @Override
    public void delete(Long id) {
        personRepository.delete(id);
    }
}
