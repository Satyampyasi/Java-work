package Logical_Question_Stream;

import java.util.Scanner;
/*4. Write a program to remove the duplicate
characters from the given String?
Ex: banaans Output: bans
 if(check[i]==false) {
		    	  result+=str.charAt(i);
		    	  check[i]=true;
		      }
		         */

public class Duplicate {
	
	
	
	public static  String  CheckDuplicate(String str) {
		String result="";
	
		
		for(int i =0;i<str.length();i++) {
			int count=0;
		     if(str.charAt(i)!=' ') {
		    	 for(int j =i+1;j<str.length();j++) {
		    		 if(str.charAt(i)==str.charAt(j)) {
		    			 count++;
		    		 }
		    	 }
		    	 if(count==0) {
		    		 result+=str.charAt(i);
		    	 }
		    	 
		     }
			
		}
		return result ;
						
	}
	

	public static void main(String[] args) {
		  String str = "banaans";
		  System.out.println(" Duplicate removed: "+CheckDuplicate(str));

	}

}
