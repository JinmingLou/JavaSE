package JDBC;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123587");
        System.out.println(connection);
        String sql = "select * from emp";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int anInt;
        String ename;
        while (resultSet.next()) {
            //索引编号（下标）
            anInt = resultSet.getInt(1);
            System.out.println(anInt);
            //列名
            ename = resultSet.getString("ename");
            System.out.println(ename);
            System.out.println("-----------------");
            System.out.println(resultSet.getNString(1));
            System.out.println("-------");
        }
        statement.close();
        connection.close();
    }
}





















