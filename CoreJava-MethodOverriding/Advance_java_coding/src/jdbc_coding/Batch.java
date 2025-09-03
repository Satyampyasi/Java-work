package jdbc_coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
public class Batch {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String password = "8220";
	private static final String username = "mydb";

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			Scanner sc = new Scanner(System.in);
			Statement sta = con.createStatement();
		    while(true) { 
		    	System.out.println("Enter name: ");
		    	String name= sc.next();
		    	System.out.println("Enter age: ");
		    	int age = sc.nextInt();
		    	System.out.println("Enter id: ");
		    	int id=sc.nextInt();
		    	System.out.println("Enter more data (Y/N): ");
		    	String choice = sc.next();
		    	String query = String.format("Insert into student(id,name,age) values(%d,'%s',%d)",id,name,age);
		    
		    	sta.addBatch(query);
		    	if(choice.toUpperCase().equals("N")) {
		    		System.out.println("Data Entered");
		    		break;
		    	}
		    
		    }
			int arr [] = sta.executeBatch();
			
		     for(int i = 0;i<arr.length;i++) {
		    	 if(arr[i]==0)System.out.println("Query no "+i+ "not  excute");
		     }

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

}
