package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ListMember {
    
    String connectionString = "jdbc:mysql://localhost" +
                                "/listIdol?user=daew&password=password";
    
    String driver = "com.mysql.cj.jdbc.Driver";
    
    @RequestMapping("/member")
    ArrayList member() {
        ArrayList a = new ArrayList();
        try {
            Class.forName(driver);
            
            Connection cn = DriverManager.getConnection(connectionString);
            
            String  sql = "select * from member";
            
            var ps = cn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String name = rs.getString("name");
                a.add(name);
            }
            
            rs.close();
            ps.close();
            cn.close();
            
        } catch (Exception e) {
            a.add(e);
        }
        return a;
    }
}
