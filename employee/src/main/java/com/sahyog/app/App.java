package com.sahyog.app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {

    Connection dbh;

     Connection connectDB() {
        String jdbcUrl = "jdbc:mysql://localhost/employee";
        String username = "dbuser";
        String password = "qwerasdf";

        try {
            // Establishing a connection to the MySQL database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            if (connection != null) {
                System.out.println("Connected to the database!");
                return connection;
            }
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database!");
            e.printStackTrace();
        }

        return null; 
    }
     void selectTable(String tableName ){ 
        try {
            
        Statement statement = dbh.createStatement();

        // Executing a SQL query to retrieve all records from the student table
        String query = "SELECT * FROM " + tableName;
        ResultSet resultSet = statement.executeQuery(query);

        // Iterating over the result set and printing records
        while (resultSet.next()) {
            int id = resultSet.getInt("emp_id");
            String name = resultSet.getString("emp_name");
            int age = resultSet.getInt("emp_sal");
            // You can retrieve other columns similarly

            // Print or process the retrieved data
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

    } catch (Exception e) {
        System.out.println("Could not select table");
    }


    }


    public static void main(String[] args) {
        App obj = new App();
        obj.dbh = obj.connectDB();
        obj.selectTable("employee_details");
        System.out.printf("Completed the code , bye for now\n\n\n");
        System.exit(0);
        // Creating a statement for executing SQL queries
       }
    


}
