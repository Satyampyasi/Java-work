package jdbc_coding;

import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

class Account
{
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

class AccountOperation {
	
 	static Connection con = null;
    PreparedStatement sta = null;

	public static boolean addAccountDetails( Account account) {
		   
		   String  Query = " Insert into accounts values( ?,?,?)";
		   
		   PreparedStatement psta = con.prepareStatement(Query);
		  
		  
		  psta.setLong(1,account.getAccount_number() );
		  psta.setString(2,account.getAccount_holder() );
		  psta.setDouble(3,  account.getAccount_balance());
		  int k = psta.executeUpdate();
		if(k>0)
		{
			return true;
		}
		else return false;
		
		
	  
}
	
	public static void transactionOperation(Account account, Scanner sc ) {
		
		
		String Query = " update accounts set ? where  ACC_NO = ? ";
		System.out.println(" Enter balance to be update: ");
		double bal= sc.nextDouble();
		  
		 PreparedStatement psta = con.prepareStatement(Query);
		 psta.setDouble(1,  account.getAccount_balance()+bal);
		  psta.setLong(2,account.getAccount_number() );
		
	}
	  

	
	   
	  
	  try {
		  Properties props = new Properties();
	      props.load(new FileReader("src/jdbc_coding/driverinfo.properties"));

	      String url = props.getProperty("url");
	      String user = props.getProperty("user");
	      String pwd = props.getProperty("pwd");
	      con = DriverManager.getConnection(url, user, pwd);
	     
		  
	  }
	    
	  
	  catch(Exception e) {
		  e.printStackTrace();
		  
	  }
	 
	  
  
    
	
}



public class Account_operation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your Choice:\n1.Deposit\n2.Withdraw\n3.Create New Account\n4.View All Account Details\n5.Exit ");
		
		
		
		int choice = Integer.parseInt(sc.nextLine());
		 switch(choice){
			 
			 case 1: System.out.println(" Enter your Account number:");
			 Account ac = new Account();
			 AccountOperation.transactionOperation(ac);
			 
			   
			 break;
			 case 2:
				 break;
			 case 3:
				 System.out.println("Enter Acount No ");
				 long accno = sc.nextLong();
				 sc.nextLine();
				 System.out.println(" Enter name : ");
				 String name = sc.nextLine();
				 
				 System.out.println("Enter balance: ");
				 double bal = sc.nextDouble();
				 
				 Account ac = new Account(accno,name,bal);
				 if(AccountOperation.addAccountDetails(ac))
				 {
					 System.out.println("Account created Sucessfully: ");
				 }
				 else System.out.println(" Acount not created ");
				 break;
			 case 4: 
			 }
		
		
			 
	}		 
		 
	
}



