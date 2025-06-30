package jdbc_coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;





public class Insert_jdbc {
  private static final  String url ="jdbc:oracle:thin:@localhost:1521:XE";
  private static final  String username="mydb";
  private static final  String password ="8220";
  public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	   try( Connection con =  DriverManager.getConnection(url, username, password); ){	    	 
//		   String query = String.format( "INSERT INTO STUDENT(name,age,id) values('%s', %o, %o)","Rahul ",25,004);
//		   String query = String.format("update student set age = %o where id = %o",20,1);
		   String query = "INSERT INTO STUDENT(NAME,AGE,ID) VALUES( ? ,? ,?)";
		   PreparedStatement  psta = con.prepareStatement(query);
		   psta.setString(1,"ajay");
		   psta.setInt(2, 26);
		   psta.setInt(3, 5);
	    int roweffect = psta.executeUpdate();
	  if(roweffect>0) {
		 System.out.println("Data inserted");
	  }
	  else System.out.println("Data not inserted ");
	       }
	}
	catch(ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
}
