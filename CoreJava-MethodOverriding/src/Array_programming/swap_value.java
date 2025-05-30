package Array_programming;
import java.util.Scanner;



public class swap_value {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value of a :");
	int a = sc.nextInt();
	
	System.out.println("Enter a value of  b");
	int b = sc.nextInt();
	sc.close();
	   a =  a+b;
	   b =  a-b;
	   a =  a-b;
	   
	   System.out.println("value of a "+a+"\nvalue of b "+b);
	   
	}
}
