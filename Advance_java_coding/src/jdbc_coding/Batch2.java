package jdbc_coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Batch2 {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String password = "8220";
	private static final String username = "mydb";

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			Scanner sc = new Scanner(System.in);
			String query = ("Insert into student(id,name,age) values(?,?,?)");
			PreparedStatement psta = con.prepareStatement(query);
		    while(true) { 
		    	System.out.println("Enter name: ");
		    	String name= sc.next();
		    	System.out.println("Enter age: ");
		    	int age = sc.nextInt();
		    	System.out.println("Enter id: ");
		    	int id=sc.nextInt();
		    	
		    	psta.setInt(1, id);
		    	psta.setString(2, name);
		    	psta.setInt(3, age);
		    	
		    	psta.addBatch();
		    	
		       System.out.println("Enter more data (Y/N): ");
		   	   String choice = sc.next();
		    	
		    	if(choice.toUpperCase().equals("N")) {
		    		System.out.println("Data Entered");
		    		break;
		    	}
		    
		    }
			int arr [] = psta.executeBatch();
			
		     for(int i = 0;i<arr.length;i++) {
		    	 if(arr[i]==0)System.out.println("Query no "+i+ "not  excute");
		     }

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

}