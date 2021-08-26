package com.example.databaseDemo.src.blog.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBUtils {
    String url;
    String user;
    String password;
    Connection connection;
    Statement statement;

    public boolean initialize(byte dbsmType) {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("database.properties"));
            url = p.getProperty("url");
            user = p.getProperty("user");
            password = p.getProperty("password");

            switch (dbsmType) {
                case 0:
                    // MySql
                    Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection(
                            url + "?user=" + user + "&password" + password
                    );
                    break;
                case 1:
                    // Oracle

                    break;
                default:
                    throw new IllegalArgumentException("Invalid DBMS Type");
            }
//            System.out.println(url);
//            System.out.println(user + " " + password);
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if (connection == null) {
            throw new NullPointerException("Connection is null");
        }

        return true;
    }

    public void createStatement() {
        if (statement == null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ResultSet retrieveData(String sqlCommand) {
        try {
            createStatement();
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int insertData(String sqlCommand, int[] indexes, String[] values) {
        return executeUpdate(sqlCommand, indexes, values);
    }

    public int updateData(String sqlCommand, int[] indexes, String[] values) {
        return executeUpdate(sqlCommand, indexes, values);
    }

    public int deleteData(String sqlCommand, int[] indexes, String[] values) {
        return executeUpdate(sqlCommand, indexes, values);
    }

    public int executeUpdate(String sqlCommand, int[] indexes, String[] values) {
        if (sqlCommand == null) {
            throw new NullPointerException("SQL command is null");
        }

        int rowNo = 0;
//        String sqlCommand = "insert into students values(default , ?)";
//        String values = "Giang updated";
//        String id = "1";
//        String sqlCommand = "update students set name = ? where id = ?";
//        String id = "1";
//        String sqlCommand = "delete from students where id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sqlCommand);
            if (indexes != null && values != null) {
                if (indexes.length != values.length) {
                    throw new IllegalArgumentException();
                }

                for (int i = 0; i < values.length; i++) {
                    ps.setString(indexes[i], values[i]);
                }
            }
//            ps.setString(1, values);
//            ps.setString(1, id);
            rowNo = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowNo;
    }

//    public static void main(String[] args) {
//        DBUtils dbUtils = new DBUtils();
//        if (dbUtils.initialize((byte) 0)) {
//            System.out.println("Connection is initialized");
////            System.out.println(dbUtils.executeUpdate() + " row affected");
//        }
//        String sqlCommand = "select name from students";
//        ResultSet rs = dbUtils.retrieveData(sqlCommand);
//
//        try {
//            while (rs.next()) {
//                System.out.println(rs.getString("name"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
////        while (true) {
////            try {
////                if (!rs.next()) break;
////            } catch (SQLException e) {
////                e.printStackTrace();
////            }
////
////        }
////        System.out.println(System.getProperty("user.dir"));
////        System.out.println(System.getProperty("java.home"));
//    }
}
