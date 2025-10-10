package Exception_work;

import java.util.Scanner;


public class CustomException {
	public static void CheckAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw  new InvalidAgeException("You are not Eligible for vote");
		}
		else  System.out.println("You are Eligible for vote ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age =sc.nextInt();
		try {
			CheckAge(age);
		}
		catch(InvalidAgeException  e) {
			System.out.println(e.getMessage());
		}

           sc.close();
	}
}
class InvalidAgeException extends Exception{
	InvalidAgeException(String Msg){
		super(Msg);
	}
}