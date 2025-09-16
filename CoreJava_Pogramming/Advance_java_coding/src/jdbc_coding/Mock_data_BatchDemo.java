package jdbc_coding;
import  java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Mock_data_BatchDemo {
public static void main(String[] args) throws FileNotFoundException{
	final String url= "jdbc:oracle:thin:@localhost:1521:XE";
	final String username ="mydb";
	final String pass="8220";
	String Query="Insert Into  StudentInfo values(?,?,?,?)";
	try {
		FileReader fis = new FileReader("C:\\Users\\ADMIN\\Downloads\\MOCK_DATA.csv");

		Connection con = DriverManager.getConnection(url, username, pass);
		PreparedStatement psta = con.prepareStatement(Query);
		
		Scanner sc = new Scanner(fis);
		
		sc.nextLine();
		
		while(sc.hasNext()) {
			String split[] = sc.nextLine().split(",");
			for(int i =0;i<split.length;i++) {
				psta.setString(i+1, split[i]);
			}
			psta.addBatch();
		}
		psta.executeBatch();
		System.currentTimeMillis();
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
}
}
