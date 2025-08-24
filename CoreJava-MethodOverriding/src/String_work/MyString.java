package String_work;

import java.util.Scanner;

public class MyString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the word");
	String word = sc.nextLine();
	 word = word.toLowerCase();
	 
	  for(int i =0;i<word.length();i++) {
	if( word.charAt(i)=='a' || word.charAt(i)== 'e' || word.charAt(i)=='i'|| word.charAt(i)=='o' || word.charAt(i)=='u'   ) {
			  System.out.print((char)(word.charAt(i)+1));
		  }
	else System.out.print(word.charAt(i));
	  }
	  sc.close();
}
}

