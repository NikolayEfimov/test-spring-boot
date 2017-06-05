package bootApp;

import bootApp.dao.BaseDao;
import bootApp.entities.Person;
import bootApp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.Random;

@RestController
public class HelloController {

    @Autowired
    private BaseDao baseDao;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    @Qualifier("h2DataSource")
    private DataSource dataSource;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Booot!";
    }

    @RequestMapping("/home")
    String home() {
        return "HelloWorld";
    }

    @RequestMapping("/data")
    String getSomeData() {
        try {
            baseDao.connectWithH2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    @RequestMapping("/person/{id}")
    Person addPerson(@PathVariable("id") Long id) {
        Person person = new Person();
        person.setId(id);
        person.setName("person " + id);
        person.setAge(new Random().nextInt());
        return personRepository.save(person);
    }

    @RequestMapping(value = "/person/{id}")
    Person findById(@PathVariable("id") Long id) {
        Person byName = personRepository.findById(id);
        System.out.println("byName = " + byName);
        return byName;
    }

    @RequestMapping(value = "/person/{id}",method = RequestMethod.DELETE)
    ResponseEntity delete(@PathVariable("id") Long id) {
        personRepository.delete(id);
        return ResponseEntity.ok().build();
    }
}
