package jdbc_coding;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class update_prepared_sta {
private static final String url ="jdbc:oracle:thin:@localhost:1521:XE";
private static final String password ="8220";
private static final String username = "mydb";
public static void main(String[] args) {
	try (Connection con = DriverManager.getConnection(url, username, password) ){
		 String query = "update student set name = ? where id =?";
		 PreparedStatement psta = con.prepareStatement(query);
		 psta.setString(1, "satyam");
		 psta.setInt(2, 2);
	 int roweffect=	 psta.executeUpdate();
	 if(roweffect>0) {
		 System.out.println("Table updated succesfully");
	 }
	 else{
		 System.out.println("not updated");
	 }
		 
	}
	catch(SQLException e ) {
		System.out.println(e.getMessage());
		
	}
}


}
