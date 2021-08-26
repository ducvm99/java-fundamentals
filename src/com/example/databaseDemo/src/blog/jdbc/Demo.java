package com.example.databaseDemo.src.blog.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {
        DBUtils dbUtils = new DBUtils();
        System.out.println(dbUtils.initialize((byte) 0));

        String sqlCommand = "insert into students values(default, ?)";
        int[] indexes = new int[]{1};
        String[] values = new String[]{"minh duc"};
        System.out.println(dbUtils.insertData(sqlCommand, indexes, values)
                + " row is inserted");
        values = new String[]{"ha linh"};
        System.out.println(dbUtils.insertData(sqlCommand, indexes, values)
                + " row is inserted");

        sqlCommand = "update students set name = ? where id = ?";
        indexes = new int[]{1, 2};
        values = new String[]{"duc hello world", "2"};
        System.out.println(dbUtils.updateData(sqlCommand, indexes, values)
                + " row is updated");

        sqlCommand = "delete from students where id = ?";
        indexes = new int[]{1};
        values = new String[]{"3"};
        System.out.println(dbUtils.deleteData(sqlCommand, indexes, values)
                + " row is deleted");

        sqlCommand = "select * from students";
        ResultSet rs = dbUtils.retrieveData(sqlCommand);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
