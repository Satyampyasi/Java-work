package jdbc_coding;

import java.util.Scanner;
import java.sql.*;
public class Batch_task {
public static void main(String[] args) {
	final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	final String user = "mydb";
	final String  pwd = "8220";
	final String Insert_Query = "INSERT INTO STUDENT( ID,Name,Age) VALUES(SEQ.NEXTVAL,?,?)";
	String option ="N";
	try( Connection con = DriverManager.getConnection(url, user, pwd);
		PreparedStatement psta = con.prepareStatement(Insert_Query)	){
		 Scanner sc = new Scanner(System.in);
		   do {
			  
               System.out.println("Enter Student name: ");
               String name = sc.nextLine();
               System.out.println("Enter age: ");
               int age = sc.nextInt();
               sc.nextLine(); // Consume the newline character
               psta.setString(1, name);
               psta.setInt(2, age);
               
               psta.addBatch();
           
               System.out.println("Do you want to continue insertion? (Y/N)");
               option = sc.nextLine();
               
           } while (option.equalsIgnoreCase("Y"));
		   
			sc.close();
			int arr [] = psta.executeBatch();
		
		     int noOfquery = 0;
	            for (int value : arr) {
	                if (value >= 0) { 
	                    noOfquery += value;
	                }
	            }
	            
		     System.out.println("Query  "+noOfquery+ "  excute");
		     
		    
		    
		     String Query2="SELECT * FROM STUDENT ";
		     
		     try ( Statement sta = con.createStatement()){
		    	 ResultSet result = sta.executeQuery(Query2);
		    	 while(result.next()) {
			    	 String name = result.getString("Name");
			    	 System.out.println(" NAME  : ="+name );
			    	 System.out.println(" age ");
			     }
		 		
		 	}
		      
		   
	}
	
	catch(SQLException e) {
	e.printStackTrace();
	}
}

}
