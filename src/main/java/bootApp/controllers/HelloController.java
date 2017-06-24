package bootApp.controllers;

import bootApp.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private BaseDao baseDao;

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

}
