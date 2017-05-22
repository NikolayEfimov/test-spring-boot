package bootApp;

import bootApp.dao.BaseDao;
import bootApp.entities.Person;
import bootApp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private BaseDao baseDao;

    @Autowired
    private PersonRepository personRepository;

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


    @RequestMapping("/person")
    String getPerson() {
        Person vasia = new Person();
        personRepository.save(vasia);
        long count = personRepository.count();

        return "";
    }
}
