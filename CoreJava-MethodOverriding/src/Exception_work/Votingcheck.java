package Exception_work;

import java.util.Scanner;

class checkage{
	public static void  isEligible(int age )throws invalidageException {
	 if(age>17 && age<150) {
		 System.out.println("you can vote you are eligible");
	 }
	 else {
		 throw new invalidageException("you are not eligible for voting ");
	 }
	}
}

public class Votingcheck {
public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter your age ");
	int age = sc.nextInt();
	
   checkage c1 = new checkage();
   try{
	   checkage.isEligible(age);
   }
   catch(invalidageException e ) {
	   System.out.println(e.getMessage());
   }
   
}

}
class invalidageException extends Exception{
	public invalidageException(String message){
		super(message);
	}
}