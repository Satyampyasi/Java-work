package Stream_API;

import java.util.Arrays;

interface work{
	
	boolean check(int num);
}

public class Stream_with_mthod_ref {
	public static void main(String[] args) {
		
		int number []= { 2,4,1,6,8,7,15,17,19,26,47};
		work w1 = Stream_with_mthod_ref::isprime;
		
		int prime [] = Arrays.stream(number).filter(w1::check).toArray();
		System.out.println(Arrays.toString(prime));
		
	}
	
	static boolean isprime(int num) {
		 
	   	 if(num<2) {
	   		 return false;
	   	 }
	   	  {
	   		 for( int i =2 ;i<=Math.sqrt(num);i++) {
	   			  if(num%i==0) return false;
	   			 
	   		 }
	   		 
	   	 }
		return true;
			
		 }
	}


