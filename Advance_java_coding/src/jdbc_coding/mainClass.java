package jdbc_coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mainClass {
    
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String username = "mydb";
    private static final String password = "8220";
    
    public static void main(String[] args) {
        try {
            // Load Oracle 11g JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
 try (Connection con = DriverManager.getConnection(url, username, password); 
		 Statement sta = con.createStatement()) {
                
                // Corrected query
                String query = "SELECT * FROM student";
                ResultSet resultset = sta.executeQuery(query);
                
                while(resultset.next()) {
                    int id = resultset.getInt("ID");
                    String name = resultset.getString("NAME");
                    int age = resultset.getInt("AGE");
                    System.out.println(id + " " + name + " " + age);
                }
            }
        } catch(ClassNotFoundException e) {
            System.err.println("Oracle JDBC Driver not found");
            e.printStackTrace();
        } catch(SQLException e) {
            System.err.println("Database connection error");
            e.printStackTrace();
        }
    }
    
    
}