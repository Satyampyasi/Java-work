package jdbc_coding;

import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

class Account{
	long account_number;
	String account_holder;
	double account_balance;
	public Account() {};
	public Account(long account_number, String account_holder, double account_balance) {
		super();
		this.account_number = account_number;
		this.account_holder = account_holder;
		this.account_balance = account_balance;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", account_holder=" + account_holder + ", account_balance="
				+ account_balance + "]";
	}
	
	
}

//class AccountOperation {
//	
// 	static Connection con = null;
//    PreparedStatement sta = null;
//
//	  
//	  String Query=" insert ";
//	   
//	  
//	  try {
//		  Properties props = new Properties();
//	      props.load(new FileReader("src/jdbc_coding/driverinfo.properties"));
//
//	      String url = props.getProperty("url");
//	      String user = props.getProperty("user");
//	      String pwd = props.getProperty("pwd");
//	      con = DriverManager.getConnection(url, user, pwd);
//	      PreparedStatement psta = con.prepareStatement(Query);
//		  
//	  }
//	    
//	  
//	  catch(Exception e) {
//		  e.printStackTrace();
//		  
//	  }
//	 
//	  
//  
//    
//	
//}











//
//public class Account_operation {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter your Choice: ");
//		
//		
//		
//		int choice = sc.nextInt();
//		 switch(choice){
//			 
//			 case 1:{ System.out.println(" Enter your Account number:");
//			   
//			 
//			 }
//			 
			 
		 
	




