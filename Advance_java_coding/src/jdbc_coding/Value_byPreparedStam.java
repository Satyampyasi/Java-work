package jdbc_coding;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import java.io.IOException;
import java.io.FileReader;

import java.util.Scanner;
import java.util.Properties;

public class Value_byPreparedStam {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			
		    prop.load(new FileReader("src/jdbc_coding/driverinfo.properties"));
			
		    String url = prop.getProperty("url");
		    String user = prop.getProperty("user");
		    String pwd = prop.getProperty("pwd");
		    String Query = "INSERT INTO STUDENT(ID,Name,Age) values( SEQ.NEXTVAL,?,?)";
		    Scanner sc = new Scanner(System.in);
		    String choice ="N";
		    try (Connection con = DriverManager.getConnection(url, user, pwd);
		    	  PreparedStatement psta = con.prepareStatement(Query)){
		          do {
		        	  System.out.println("Enter Student name: ");
		        	  String name = sc.nextLine();
		        	  
		        	  System.out.println("Enter age: ");
		        	  int age = sc.nextInt();
		        	  
		        	  psta.setString(1, name);
		        	  psta.setInt(2,age);
		        	   
		        	   int result = psta.executeUpdate();
		        	   if(result >0)System.out.println(" Row Inserted ");
		        	   
		        	   sc.nextLine();
		        	   System.out.println("Do you want to insert more row: Y/N ");
		        	   choice = sc.nextLine();
		        	  
		          }
		          while(choice.equalsIgnoreCase("Y"));
		          System.out.println(" Thank you!");
		    	
		    }
		 
		   }
		   catch(IOException e ) {
		    	System.out.println(e.getMessage());
		    }
		
		catch(SQLException e ) {
			System.out.println(e.getMessage());
		}
	}

}
