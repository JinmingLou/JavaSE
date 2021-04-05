package JDBC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DButil {

     public static boolean executeSQL(String sql) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123587");

        Statement statement = connection.createStatement();
        boolean execute = statement.execute(sql);

        statement.close();
        connection.close();

        return execute;
    }
}
