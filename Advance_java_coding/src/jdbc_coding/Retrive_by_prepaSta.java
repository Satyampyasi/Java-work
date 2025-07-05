package jdbc_coding;

import java.sql.*;


public class Retrive_by_prepaSta {
 private static final String url="jdbc:oracle:thin:@localhost:1521:XE";
 private static final String  password ="8220";
 private static final String  username="mydb";
 public static void main(String[] args) {
// it optional to load driver
	 try( Connection con = DriverManager.getConnection(url, username, password)){
		 String query = String.format("Select * from Student ");
		 PreparedStatement  psta = con.prepareStatement(query);
//		 psta.setInt(1,1);
		 
		   ResultSet resultset = psta.executeQuery();
		   
		 while(resultset.next()) {
			 String name = resultset.getString("name");
			 int age = resultset.getInt("age");
			 int id = resultset.getInt("Id");
			 System.out.println("NAME: "+name+"\n"+"Age: "+ age+"\nid: "+id);
		 }
		 System.out.println("Data retrive ");
	 }
	 catch(SQLException e) {
		 System.out.println(e.getMessage());
	 }
}
 
}
