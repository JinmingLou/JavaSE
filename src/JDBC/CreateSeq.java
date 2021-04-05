package JDBC;

import JDBC.util.DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSeq {
    public static void main(String[] args) throws Exception {
        System.out.println(DButil.executeSQL("create sequence seq_2 increment by 1 start with 1"));
    }
}













