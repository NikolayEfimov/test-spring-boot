package bootApp;

import bootApp.dao.BaseDao;
import bootApp.entities.Person;
import bootApp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

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
    Person getPerson(@PathVariable("id") Long id) {
        try {
            System.out.println("id = " + id);
            Connection connection = dataSource.getConnection();
            Person vasia = new Person();
            vasia.setId(3L);
            vasia.setName("Vasia");
            vasia.setAge(30);
            personRepository.save(vasia);
            Person byName = personRepository.findById(id);
            System.out.println("byName = " + byName);
            return byName;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
