 package jdbc_coding;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Students {
   private static final String url ="jdbc:oracle:thin:@localhost:1521:XE";
   private static final String username ="mydb";
   private static final String password ="8220";
   public static void main(String[] args) {
	   
	   try {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   try(Connection con = DriverManager.getConnection(url,username,password); Statement sta = con.createStatement()){
			   String query = "SELECT * FROM STUDENT";
			        ResultSet resultset = sta.executeQuery(query);
			        while(resultset.next()) {
			        String name =  resultset.getString("name");
			        int age = resultset.getInt("age");
			        int id = resultset.getInt("id");
			        System.out.println(name+" "+age+" "+id);
			        }
		}
	   }
	
	catch( SQLException e) {
		System.out.println(" connection not found ");
	}
	catch(ClassNotFoundException e) {
		
	}
}
}
