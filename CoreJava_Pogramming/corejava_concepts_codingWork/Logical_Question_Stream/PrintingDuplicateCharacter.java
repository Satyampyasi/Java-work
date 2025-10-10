package Logical_Question_Stream;
/*
 6. Write a program to print duplicate characters
from the given String?
Ex: Programming Output: r, g, m*/
import java.util.Scanner;

public class PrintingDuplicateCharacter {
	
	public   static String printDuplicate(String str) {
		String result="";
		  for(int i =0;i<str.length();i++) {
			   int count=0;
			    if(str.charAt(i)!=' ') {
			    	for(int j=i+1;j<str.length();j++) {
			    		if(str.charAt(i)==str.charAt(j)) {
			    			count++;
			    			break;
			    		}
			    	}
			    	if(count!=0) result= result+str.charAt(i)+", ";
			    	
			    }
		  }
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
           System.out.println(printDuplicate(str));
		
	}

	}


