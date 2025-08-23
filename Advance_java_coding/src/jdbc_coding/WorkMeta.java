package jdbc_coding;
import java.sql.*;
public class WorkMeta {
	private static final String url= "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String username ="mydb";
	private static final String pass="8220";
	public static void main(String[] args) throws ClassNotFoundException ,SQLException  {
		// step 1: loading a driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// step 2 Create Connection 
		Connection con = DriverManager.getConnection(url, username, pass);
		
		//step  3 create statement 
		Statement sta =con.createStatement();
		ResultSet res = sta.executeQuery("SELECT * FROM STUDENT");
		ResultSetMetaData rsmd = res.getMetaData();
		 
		 if(res.next()) {
			 for(int i =1;i<=rsmd.getColumnCount();i++) {
				 System.out.print(rsmd.getColumnName(i)+"\t\t");
			 }
			 System.out.println("\n-----------------------------------");
			 while(res.next()) {
				 for(int i =1;i<=rsmd.getColumnCount();i++) {
					 System.out.print(res.getString(i)+"\t\t");
				 }
				 System.out.println();
			 }
		 }
		 else System.out.println("No row selected");
	}
}
