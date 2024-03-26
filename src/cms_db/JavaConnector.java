/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class JavaConnector {
    private final String DB_URL = "jdbc:mysql://localhost";
    private final String USER = "admin";
    private final String PASSWORD = "java";
    
    public void courseReport() throws SQLException {
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.execute("use database db_cms;");
            stmt.execute("select g.module_name," +" count c.no_students as total_no_students" + "from grades g" + "join l.lecturer_name as lecturers" + "join l.lecturer_subject as programme";);
        }
    }
}
