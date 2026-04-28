package employee.management.system;

import java.sql.*;

public class Conn {
    Connection c; // interface
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/employeemanagementsystem?useSSL=false&serverTimezone=UTC",
    "root",
    "bhumik@07"
);

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
