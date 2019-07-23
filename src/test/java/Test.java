import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Admin on 2019/7/22.
 */
@Service
public class Test {

    private static final String URL = "jdbc:mysql://localhost:3306/ssm";
    private static final String NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库的连接
            Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
            //3.通过数据库的连接操作数据库，实现增删改查
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()) {//如果对象中有数据，就会循环打印出来
                System.out.println(rs.getString("id") + "," + rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
