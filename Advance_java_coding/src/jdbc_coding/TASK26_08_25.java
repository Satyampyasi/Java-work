package jdbc_coding;
import java.sql.*;
import java.util.Scanner;
public class TASK26_08_25 {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String password = "8220";
	private static final String username = "mydb";

	public static void main(String[] args)  {
		String Query ="Insert Into employee_info(ID,NAME,DEPARTEMENT , SALARY , EMAIL , DESIGNATION  ) VALUES(?,?,?,?,?,?) ";
		String option ="N";
		try(Connection con = DriverManager.getConnection(url,  username,password);
			PreparedStatement psta = con.prepareStatement(Query);){
			Scanner sc = new Scanner(System.in);
			do {
				
			System.out.println(" Enter Id ");
			 int id = sc.nextInt();
			 sc.nextLine();
			 
			System.out.println(" Enter name:  ");
		    String name = sc.nextLine();
		    
		    System.out.println(" Enter Departement:  ");
		    String dept = sc.nextLine();
		    
			System.out.println(" Enter Salary  ");
			int sal = sc.nextInt();
			sc.nextLine();
			
			System.out.println(" Enter Email:  ");
			String email = sc.nextLine();
			 
			System.out.println(" Enter Desination :  ");
		    String desina = sc.nextLine();
		    
		    psta.setInt(1, id);
		    psta.setString(2,name);
		    psta.setString(3,dept);
		    psta.setInt(4, sal);
		    psta.setString(5,email);
		    psta.setString(6,desina);
		    
		    
		     psta.addBatch();
				
			}
			while(option.equalsIgnoreCase("Y"));
			
			int arr [] = psta.executeBatch();
			System.out.println(" DO you want to continew insert Y/N");
			option = sc.nextLine();
			
			
			 int noOfvalue=0;
			 
			for(int value: arr) {
				noOfvalue+=value;
			}
			System.out.println(" Row excute ="+noOfvalue);
			
			
		}
		catch( SQLException e) {
			e.printStackTrace();
			
		}
		
	}
}
