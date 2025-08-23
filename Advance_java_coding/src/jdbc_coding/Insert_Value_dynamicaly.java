package jdbc_coding;
import java.io.FileReader;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Properties;

public class Insert_Value_dynamicaly {
    public static void main(String[] args) {
        Connection con = null;
        Statement sta = null;
        Scanner sc = new Scanner(System.in);
        
        try {
            // Create empty object 
            Properties props = new Properties();
            props.load(new FileReader("src/jdbc_coding/driverinfo.properties"));

            
            String driver = props.getProperty("driver");
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String pwd = props.getProperty("pwd");
            
            Class.forName(driver);
            
            // Connection 
            con = DriverManager.getConnection(url, user, pwd);
            
            // Create Statement
            sta = con.createStatement();
            String opt = "N";
            
            do {
                System.out.println("Enter Student name: ");
                String name = sc.nextLine();
                System.out.println("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                
                String query = "INSERT INTO student(ID, Name, Age) " +
                               "VALUES(SEQ.NEXTVAL, '" + name + "', " + age + ")";
                int rowsAffected = sta.executeUpdate(query);
                System.out.println("Rows affected = " + rowsAffected);
                
                System.out.println("Do you want to continue insertion? (Y/N)");
                opt = sc.nextLine();
            } while (opt.equalsIgnoreCase("Y"));
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class not found: " + e.getMessage());
        } catch (SQLException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (sta != null) sta.close();
            } catch (SQLException e) {
                System.out.println("Error closing statement: " + e.getMessage());
            }
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
            sc.close(); // Close the scanner
        }
    }
}
 

