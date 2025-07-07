package jdbc_coding;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Log_in {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String username = "mydb";
	private static final String password = "8220";

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection(url, username, password)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 for login and 2 for registration:");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				String query1 = "Select * FROM EMP_INFO where EMPID =? and EMPNAME = ?";
			 try(PreparedStatement psta1 = con.prepareStatement(query1);){
				 System.out.print("ENTER EMPLOYEE ID:");
					long id = sc.nextLong();
					sc.nextLine();

	                
					System.out.print("ENTER EMPLOYEE name:");
					String name = sc.next();
					psta1.setString(2, name);
					psta1.setLong(1, id);

			 
				
				   try(ResultSet resultset = psta1.executeQuery()){
					   
				if (resultset.next()) {

					System.out.println("=====Welcome=====");
					
					System.out.println(
							"Enter 1 for show details\n 2)for update mailid $ phono \n 3)For detele employee whose sal between ");
					
					int choice1 = sc.nextInt();
                    sc.nextLine();
					switch (choice1) {
					case 1:
						String name1 = resultset.getString("EMPNAME");
						int sal = resultset.getInt("EMPSAL");
						long id1 = resultset.getLong("EMPID");
						long no = resultset.getLong("EMPNO");
						String fnam = resultset.getString("EMPFNAME");
						String lname = resultset.getString("EMPLNAME");
						String mail = resultset.getString("EMPMAIL");

						System.out.println("NAME: " + name1 + "\n" + "salary: " + sal + "\nId: " + id1 + "\nFNAME: "
								+ fnam + "\nLname" + lname + "\nEmail: " + mail);
						break;
					case 2:
						System.out.println("Enter new mail id ");
						String upmail = sc.next();
						int id2 = resultset.getInt("EMPId");
						String query2 = "UPDATE EMP_INFO SET EMPMAIL = ? WHERE EMPID = ?";
						PreparedStatement psta2 = con.prepareStatement(query2);
						psta2.setString(1, upmail);
						psta2.setInt(2, id2);
						psta2.executeUpdate();
						System.out.println("mail id updated..");
						break;
					case 3:

						String query3 = "DELETE FROM  EMP_INFO WHERE SAL BETWEEN 5000 AND 7000  ";
						PreparedStatement psta3 = con.prepareStatement(query3);
						psta3.executeUpdate();
						System.out.println("Employee deleted");
						break;

					case 4:
						String query4 = "UPDATE EMP_INFO SET SAL = SAL+(SAL*0.10)";
						PreparedStatement psta4 = con.prepareStatement(query4);
						psta4.executeUpdate();
						System.out.println("Employee 10% sal increased..");
						break;
					}

				}
			 

				else {
					System.err.println("Invalid process.....");
				}
			}

			 }
			}
			
			
			
			else {

				while(true) {
				String query = "INSERT INTO EMP_INFO(EMPID,EMPNAME,EMPSAL,EMPFNAME,EMPLNAME,EMPMAIL,EMPNO) VALUES(?,?,?,?,?,?,?)";
				PreparedStatement psta = con.prepareStatement(query);

				System.out.print("Enter Employee Id :");
				int EMPID = sc.nextInt();

				System.out.print("Enter Employee PhNumber :");
				long EMPNO = sc.nextLong();

				System.out.print("Enter Employee NAME :");
				String EMPNAME = sc.next();

				System.out.print("Enter Employee SAL :");
				int EMPSAL = sc.nextInt();

				System.out.print("Enter Employee FNAME :");
				String EMPFNAME = sc.next();

				System.out.print("Enter Employee LNAME :");
				String EMPLNAME = sc.next();

				System.out.print("Enter Employee MAILID:");
				String EMPMAILI = sc.next();

				psta.setInt(1, EMPID);
				psta.setString(2, EMPNAME);
				psta.setInt(3, EMPSAL);
				psta.setString(4, EMPFNAME);
				psta.setString(5, EMPLNAME);
				psta.setString(6, EMPMAILI);
				psta.setLong(7, EMPNO);
				psta.executeBatch();
				System.out.println("Data stored: ");
				System.out.println("Enter more data (Y/N): ");
			   	   String choice3 = sc.next();
			    	
			    	if(choice3.toUpperCase().equals("N")) {
			    		System.out.println("Data Entered");
			    		break;
			    	}
				}
			}
		} catch (SQLException e1) {
			System.out.println("wrong info ");
			e1.printStackTrace();
		}

	}

}
