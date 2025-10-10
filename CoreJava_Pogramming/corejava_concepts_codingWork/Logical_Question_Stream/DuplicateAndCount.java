package Logical_Question_Stream;
/*
 7. write a program to print all duplicate character
and their count form the given String?
Ex: Programming Output: g: 2
 r: 2
 m*/
import java.util.Scanner;

public class DuplicateAndCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
          printDuplicateCount(str);
		
	}

	private static void  printDuplicateCount(String str) {
	 
     boolean check[]= new boolean[256]; 
	for(int i=0;i<str.length();i++) {
		int count=1;
		  if(str.charAt(i)!=' ' && check[str.charAt(i)]==false) {
			  for(int j =i+1;j<str.length();j++) {
				  if(str.charAt(i)==str.charAt(j)) {
					  count++;
				  }
				  
			  }
			   check[str.charAt(i)]=true;
			   
			  if(count>1) {
				  System.out.print(str.charAt(i)+" - "+count+" ");
			  }
		  }
	}
	
	}

	}


