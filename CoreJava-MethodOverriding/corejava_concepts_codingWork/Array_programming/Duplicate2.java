package Array_programming;

import java.util.Scanner;

public class Duplicate2 {
  public static void main(String[] args) {
	  System.out.println("Enter tha total number of Student");
	  Scanner sc = new Scanner(System.in);
	  int size = sc.nextInt();
	  int arr [] = new int[size];
	  
	  for(int i =0;i<arr.length;i++) {
		  System.out.println("Enter registration of "+(i+1)+" Student");
		  int id =sc.nextInt();
		       for(int j = 0 ;j<i;j++) 
		       {
		    	   if(id==arr[j]) {System.out.print("Already Register \nEnter another number: ");
		    	     arr[j] = sc.nextInt();   };
		       }
		       arr[i] = id;
	  }
	  
	  
	  for(int i =0;i<arr.length;i++) {
		  System.out.println((i+1)+" Student registration no is: "+arr[i]);
	  }
	  sc.close();
  }
}
