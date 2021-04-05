package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123587");
        Statement statement = connection.createStatement();
        String sql = "create table psnnn(id number(10) primary key,name varchar2(10))";
        boolean execute = statement.execute(sql);
        //false: 没有返回结果(resultSet)就为false，建表不会返回true
        System.out.println(execute);
        statement.close();
        connection.close();
    }
}


















































