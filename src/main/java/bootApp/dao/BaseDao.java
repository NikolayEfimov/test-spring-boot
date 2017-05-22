package bootApp.dao;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Service
public class BaseDao {

    public void connectWithH2() throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        String sql = "SELECT * FROM MYTABLE";
        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString("NAME");
            System.out.println("name = " + name);
            Integer id = resultSet.getInt("ID");
            System.out.println("id = " + id);
        }
    }
}
